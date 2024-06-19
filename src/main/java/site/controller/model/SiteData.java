package site.controller.model;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.entity.Project;
import site.entity.Site;

@Data
@NoArgsConstructor
public class SiteData {

  private Long siteId;
  private String siteName;
  private String siteAddress;
  private String siteState;
  private String siteZip;
  private String sitePhone;

  private Set<ProjectData> projectData = new HashSet<>();
  
  
    public SiteData(Site site) {
    siteId = site.getSiteId();
    siteName = site.getSiteName();
    siteAddress = site.getSiteAddress();
    siteState = site.getSiteState();
    siteZip = site.getSiteZip();
    sitePhone = site.getSitePhone();

    for(Project project : site.getProjects()) {
      projectData.add(new ProjectData(project));
    }
  }

}
