package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.ChargingStationService;
import com.fivekm_home_charge.charge.web.dto.ChargingStationSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChargingStationRestController {

    @Autowired
    ChargingStationService chargingStationService;

    @PostMapping("/scs/rest/save")
    public void insertChargingStation(ChargingStationSaveDto chargingStationSaveDto) throws Exception {
        chargingStationService.insertChargingStation(chargingStationSaveDto);
    }
}
