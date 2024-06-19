package site.entity;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class TeamMember {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long teamMemberId;
  private String teamMemberRole;
  private String teamMemberName;
  private String teamMemberPhone;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  @ManyToMany(mappedBy = "teamMembers", cascade = CascadeType.PERSIST)
  private Set<Project> projects = new HashSet<>();
     
}
