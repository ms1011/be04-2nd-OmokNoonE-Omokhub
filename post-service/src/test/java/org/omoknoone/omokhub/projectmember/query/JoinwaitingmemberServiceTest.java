package org.omoknoone.omokhub.projectmember.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.omoknoone.omokhub.projectmember.query.service.JoinwaitingmemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JoinwaitingmemberServiceTest {

    @Autowired
    private JoinwaitingmemberService joinwaitingmemberService;

    @DisplayName("참여 대기 멤버 조회")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testSearchWaitingMember(int projectId) {
        Assertions.assertDoesNotThrow(
                () -> joinwaitingmemberService.searchWaitingMember(projectId)
        );
    }

    @DisplayName("초대받은 or 신청한 프로젝트 참여 대기인원")
    @Test
    void testSearchInviteOrApplyMember(){
        Assertions.assertDoesNotThrow(
                ()-> joinwaitingmemberService.searchInviteOrApplyMember()
        );
    }

    @DisplayName("내가 신청한 프로젝트 참여 대기 현황 조회")
    @Test
    void testMyCurrentApplyStatus(){
        Assertions.assertDoesNotThrow(
                ()->joinwaitingmemberService.sesarchMyCurrentApplyStatus()
        );
    }
}