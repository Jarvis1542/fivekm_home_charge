package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherServiceController {

    @GetMapping("/otherService")
    public String otherService() {
        return "/otherService/otherService";
    }

    @GetMapping("/otherService/parkingMap")
    public String ParkingMap() {
        return "/otherService/parkingMap";
    }

    @GetMapping("/otherService/EZCharging")
    public String EZCharging() {
        return "/otherService/EZCharging";
    }

    @GetMapping("/otherService/QnA")
    public String QnA() {
        return "/otherService/QnA";
    }

    @GetMapping("/otherService/bestQnA")
    public String bestQnA() {
        return "/otherService/bestQnA";
    }
}
