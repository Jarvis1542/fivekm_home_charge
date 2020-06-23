package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.HappyParkingService;
import com.fivekm_home_charge.charge.web.dto.HappyParkingDto;
import com.fivekm_home_charge.charge.web.dto.HappyParkingRequestListDto;
import com.fivekm_home_charge.charge.web.dto.HappyParkingSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

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
                                       Model model, HttpSession httpSession){
        System.out.println("주차장등록현재세션아이디 : " +  httpSession.getAttribute("userId"));
        model.addAttribute("user", httpSession.getAttribute("userId"));
        return "/happyParking/happyParkingRegister";
    }

    @GetMapping("/happyParking/happyParkingSearch")
    public String happyParkingSearch(Model model, HttpSession httpSession) throws Exception{
        model.addAttribute("user", httpSession.getAttribute("userId"));
        model.addAttribute("parking", happyParkingService.happyParkingSearch());
        return "/happyParking/happyParkingSearch";
    }

    @GetMapping("/happyParking/happyParkingSearch1")
    public String happyParkingSearch2(Model model) throws Exception{
        model.addAttribute("parking", happyParkingService.happyParkingSearch());
        return "/happyParking/happyParkingSearch2";
    }


    @GetMapping("/happyParking/happyParkingHistory")
    public String happyParkingHistory(){
        return "/happyParking/happyParkingHistory";
    }

    @GetMapping("/happyParking/requestHappyParking/{parkingName}")
    public String requestHappyParking(@PathVariable String parkingName, Model model, HttpSession httpSession) throws Exception{
        System.out.println("주차장등록현재세션아이디 : " +  httpSession.getAttribute("userId"));
        System.out.println("update : " + happyParkingService.requestHappyParking(parkingName).toString());
        model.addAttribute("request", happyParkingService.requestHappyParking(parkingName));
        model.addAttribute("user", httpSession.getAttribute("userId"));
        return "/admin/happyParkingRequest";
    }

}
