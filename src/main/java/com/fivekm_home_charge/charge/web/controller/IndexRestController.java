package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.Map1Dto;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class IndexRestController {
    @Autowired
    MemberService memberService;

    @PostMapping("/rest/join")
    public void insertMembers(MemberDto memberDto, HttpSession httpSession, Model model) throws Exception {
        model.addAttribute("user", httpSession.getAttribute("userId"));
        memberService.insertMembers(memberDto);
    }

    @GetMapping("/rest/map/map1")
    public String insertData(Map1Dto map1Dto) throws Exception{
        map1Dto.toString();
        System.out.println("lat : " + map1Dto.getLat());
        System.out.println("lng : " + map1Dto.getLng());
        return "redirect:/";
    }
}
