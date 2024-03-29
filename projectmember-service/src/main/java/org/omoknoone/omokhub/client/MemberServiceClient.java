package org.omoknoone.omokhub.client;

import org.omoknoone.omokhub.projectmember.query.dto.ResponseMemberDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "omok-user-service", url = "172.30.1.28:58000")
public interface MemberServiceClient {
    @GetMapping("/user-service/user/members/api/member-id/{memberId}")
    List<ResponseMemberDTO> getUserInfos(@PathVariable("memberId") List<String> memberIds);

}
