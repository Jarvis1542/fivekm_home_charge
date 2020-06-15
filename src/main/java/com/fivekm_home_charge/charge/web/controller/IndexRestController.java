package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class IndexRestController {

    @Autowired
    MemberService memberService;

    @PostMapping("/rest/join")
    public void insertMembers(MemberDto memberDto) throws Exception{
        memberService.insertMembers(memberDto);
    }


    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return"redirect:/";
    }
}
