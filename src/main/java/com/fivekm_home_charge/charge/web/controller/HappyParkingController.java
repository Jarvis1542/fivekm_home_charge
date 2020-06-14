package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HappyParkingController {
    @GetMapping("/happyParking")
    public String happyParking() {
        return "/happyParking/happyParking";
    }

    @GetMapping("/happyParking/happyParkingRegister")
    public String happyParkingRegister(){
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
