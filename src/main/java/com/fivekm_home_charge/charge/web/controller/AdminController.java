package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.MemberService;
import com.fivekm_home_charge.charge.web.dto.HappyParkingDto;
import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/admin/chargingRequest")
    public String chargingRequest(){
        return "/admin/chargingRequest";
    }
    @GetMapping("/admin/happyParkingRequest")
    public String happyParkingRequest(HttpSession httpSession){
        return "/admin/happyParkingRequest";
    }
    @GetMapping("/admin/memberList")
    public String memberList(Model model, HttpSession httpSession) throws Exception {
        model.addAttribute("users",memberService.getMembers());
        System.out.println(memberService.getMembers());
        return "/admin/memberList";
    }

    @PostMapping("/admin/happyParkingUpdateComplete")
    public String happyParkingUpdateComple(HappyParkingDto happyParkingDto) throws Exception{
        System.out.println(happyParkingDto.toString());
        return "redirect:/admin/happyParkingRequestList";
    }
}
