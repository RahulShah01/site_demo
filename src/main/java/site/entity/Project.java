package site.entity;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long projectId;
  private String projectName;
  private String projectLenght;
  private String projectType;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  @ManyToMany(cascade = CascadeType.PERSIST)
  @JoinTable(name = "project_team_member",
             joinColumns = @JoinColumn(name = "project_id"),
             inverseJoinColumns = @JoinColumn(name = "team_member_id"))
  private Set<TeamMember> teamMembers = new HashSet<>();
  
  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "site_id")
  private Site site;  
  
}
