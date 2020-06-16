package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.HappyParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HappyParkingController {
    @Autowired
    HappyParkingService happyParkingService;

    @GetMapping("/happyParking")
    public String happyParking() {
        return "/happyParking/happyParking";
    }

    @GetMapping("/happyParking/happyParkingRegister")
    public String happyParkingRegister(HttpServletRequest request, HttpServletResponse response,
                                       Model model){
        HttpSession session = request.getSession();
        System.out.println("주차장등록현재세션아이디 : " +  session.getAttribute("userId"));
        model.addAttribute("user", session.getAttribute("userId"));
        return "/happyParking/happyParkingRegister";
    }

    @GetMapping("/happyParking/happyParkingSearch")
    public String happyParkingSearch(){
        return "/happyParking/happyParkingSearch";
    }

    @GetMapping("/happyParking/happyParkingHistory")
    public String happyParkingHistory(){
        return "/happyParking/happyParkingHistory";
    }

}
