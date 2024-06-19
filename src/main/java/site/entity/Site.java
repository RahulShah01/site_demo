package site.entity;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Site {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long siteId;
  private String siteName;
  private String siteAddress;
  private String siteState;
  private String siteZip;
  private String sitePhone;
  
  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  @OneToMany(mappedBy = "site", cascade = CascadeType.ALL)
  private Set<Project> projects = new HashSet<>();
  
}
