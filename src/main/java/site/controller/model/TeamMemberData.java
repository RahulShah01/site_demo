package site.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import site.entity.TeamMember;

@Data
@NoArgsConstructor
public class TeamMemberData {
  
  private Long teamMemberId;
  private String teamMemberRole;
  private String teamMemberName;
  private String teamMemberPhone;
  
  public TeamMemberData (TeamMember teamMember) {
    teamMemberId = teamMember.getTeamMemberId();
    teamMemberRole = teamMember.getTeamMemberRole();
    teamMemberName = teamMember.getTeamMemberName();
    teamMemberPhone = teamMember.getTeamMemberPhone();
    
  }

}
