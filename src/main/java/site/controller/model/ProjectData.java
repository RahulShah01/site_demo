package site.controller.model;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.entity.Project;
import site.entity.TeamMember;

@Data
@NoArgsConstructor
public class ProjectData {

  private Long projectId;
  private String projectName;
  private String projectLenght;
  private String projectType;

  private Set<TeamMemberData> teamMembers = new HashSet<>();
  
  
  public ProjectData(Project project) {
    projectId = project.getProjectId();
    projectName = project.getProjectName();
    projectLenght = project.getProjectLenght();
    projectType = project.getProjectType();

    for (TeamMember teamMember : project.getTeamMembers()) {
      teamMembers.add(new TeamMemberData(teamMember));
    }
  }
}

