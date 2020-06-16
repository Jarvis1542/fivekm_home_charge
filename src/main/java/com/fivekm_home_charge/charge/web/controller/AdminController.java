package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/admin/chargingRequest")
    public String chargingRequest(){
        return "";
    }
    @GetMapping("/admin/happyParkingRequest")
    public String happyParkingRequest(){
        return "";
    }
    @GetMapping("/admin/memberList")
    public String memberList(Model model) throws Exception {
        model.addAttribute("users",memberService.getMembers());
        System.out.println(memberService.getMembers());
        return "/admin/memberList";
    }
}
