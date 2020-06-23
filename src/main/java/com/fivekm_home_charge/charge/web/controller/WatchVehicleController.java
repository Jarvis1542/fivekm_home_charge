package com.fivekm_home_charge.charge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class WatchVehicleController {
    @GetMapping("/watchVehicle")
    public String watchVehicle(Model model, HttpSession httpSession) {
        model.addAttribute("user", httpSession.getAttribute("userId"));
        return "/watchVehicle/watchVehicle";
    }
}
