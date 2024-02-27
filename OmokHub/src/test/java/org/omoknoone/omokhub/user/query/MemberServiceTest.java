package org.omoknoone.omokhub.user.query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootTest
public class MemberServiceTest {
    @Autowired
    private MemberService memberService;

    private static Stream<Arguments> getMemberInfo() {

        MemberDTO memberInfo = new MemberDTO();
        memberInfo.setMemberId("user1");
        memberInfo.setName("뱁새");
        memberInfo.setNickname("오목눈이");
        memberInfo.setEmail("user01@gmail.com");
        memberInfo.setPhoneNum("010-1234-2233");
        memberInfo.setAddress("서울시 서초구");
        LocalDate birthday = LocalDate.of(2023, 7, 15);
        memberInfo.setBirthday(birthday);

        return Stream.of(
                Arguments.of(memberInfo)
        );
    }

    @DisplayName("회원 정보 확인 테스트")
    @ParameterizedTest
    @MethodSource("getMemberInfo")
    void testSearchMemberInfoByMemberId(MemberDTO memberDTO) {
        Assertions.assertDoesNotThrow(
                () -> memberService.searchMemberInfoByMemberId(memberDTO.getMemberId())
        );
    }

    @DisplayName("닉네임으로 회원 정보 검색 테스트")
    @ParameterizedTest
    @MethodSource("getMemberInfo")
    void testSearchMemberIdByNickname(MemberDTO memberDTO) {
        Assertions.assertDoesNotThrow(
                () -> memberService.searchMemberIdByNickname(memberDTO.getNickname())
        );
    }

    @DisplayName("프로필 갯수 확인")
    @ParameterizedTest
    @MethodSource("getMemberInfo")
    void testSearchProfileCount(MemberDTO memberDTO) {
        Assertions.assertNull(memberService.searchMemberIdByNickname(memberDTO.getMemberId()));
//        Assertions.assertEquals(0, memberService.searchMemberIdByNickname(memberDTO.getMemberId()));
    }
}