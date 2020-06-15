package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRestController {

    @Autowired
    MemberService memberService;

    @PostMapping("/rest/join")
    public void addMember(MemberDto memberDto) throws Exception {
//        System.out.println("이메일 : "+ memberDto.getEmail());
//        System.out.println("아이디 : " + memberDto.getId());
//        System.out.println("비밀번호 : " +memberDto.getPassword());
        memberService.insertMembers(memberDto);
    }
}
