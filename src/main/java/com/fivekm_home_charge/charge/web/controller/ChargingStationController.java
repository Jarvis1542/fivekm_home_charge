package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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

    @GetMapping("/chargingStation/upload")
    public String upload(){
        return "/chargingStation/upload";
    }

}
