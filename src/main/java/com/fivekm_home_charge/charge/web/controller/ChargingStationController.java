package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChargingStationController {

    @GetMapping("/chargingStation")
    public String chargingStation() {
        return "/chargingStation/chargingStation";
    }

    @GetMapping("/chargingStation/chargingRegister")
    public String chargingRegister(){
        return "/chargingStation/chargingRegister";
    }

    @GetMapping("/chargingStation/chargingSearch")
    public String chargingSearch(){
        return "/chargingStation/chargingSearch";
    }

    @GetMapping("/chargingStation/chargingHistory")
    public String chargingHistory(){
        return "/chargingStation/chargingHistory";
    }
}
