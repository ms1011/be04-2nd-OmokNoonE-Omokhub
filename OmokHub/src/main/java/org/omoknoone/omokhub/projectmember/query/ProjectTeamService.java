package org.omoknoone.omokhub.projectmember.query;

import org.omoknoone.omokhub.projectmember.query.repository.ProjectTeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectTeamService {

    private ProjectTeamMapper projectTeamMapper;

    @Autowired
    public ProjectTeamService(ProjectTeamMapper projectTeamMapper) {
        this.projectTeamMapper = projectTeamMapper;
    }

    public void findTeamByProject(String teamName){
        List<ProjectTeamDTO> projectTeamDTOs = projectTeamMapper.selectTeamByProject(teamName);
        projectTeamDTOs.forEach(System.out::print);
        System.out.println("findTeamByProject 테스트 완료");
    }
}
