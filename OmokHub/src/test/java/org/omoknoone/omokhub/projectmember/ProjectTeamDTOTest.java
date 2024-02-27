package org.omoknoone.omokhub.projectmember;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.omoknoone.omokhub.projectmember.query.ProjectTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ProjectTeamDTOTest {

    @Autowired
    private ProjectTeamService projectTeamService;
    @Test
    void findTeamByProject(){
        Assertions.assertDoesNotThrow(
                () -> projectTeamService.findTeamByProject("Development Team")
        );
    }
}