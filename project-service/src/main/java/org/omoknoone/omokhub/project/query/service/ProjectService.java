package org.omoknoone.omokhub.project.query.service;

import org.omoknoone.omokhub.project.query.dto.ProjectAndScheduleDTO;
import org.omoknoone.omokhub.project.query.dto.ProjectAndTeamAndMemberDTO;

import java.util.List;

public interface ProjectService {
    List<ProjectAndTeamAndMemberDTO> projectByProjectId(int projectId);

    List<ProjectAndTeamAndMemberDTO> searchProjectByStatus(String status);

    List<ProjectAndTeamAndMemberDTO> searchProjectByTeamName(String teamName);

    List<ProjectAndTeamAndMemberDTO> searchMyProjects(String memberId);
}
