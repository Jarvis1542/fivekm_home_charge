package com.fivekm_home_charge.charge.web.controller;

import com.fivekm_home_charge.charge.service.ChargingStationService;
import com.fivekm_home_charge.charge.web.dto.ChargingStationSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class ChargingStationRestController {

    @Autowired
    ChargingStationService chargingStationService;

    @PostMapping("/scs/rest/save")
    public void insertChargingStation(ChargingStationSaveDto chargingStationSaveDto, HttpSession httpSession)
            throws Exception {
        httpSession.getAttribute("userId");

        System.out.println("충전소 이름" + chargingStationSaveDto.getChargeName());
        System.out.println("운영기관" + chargingStationSaveDto.getOperation());
        System.out.println("운영시간" + chargingStationSaveDto.getOperationTime());
        System.out.println("충전 속도" + chargingStationSaveDto.getChargeSpeed());
        System.out.println("우편번호" + chargingStationSaveDto.getPostcode());
        System.out.println("도로주소" + chargingStationSaveDto.getRoadAddress());
        System.out.println("상세주소" + chargingStationSaveDto.getDetailAddress());
        System.out.println("참고항목" + chargingStationSaveDto.getExtraAddress());
        System.out.println("사진1" + chargingStationSaveDto.getImage1());
        System.out.println("사진2" + chargingStationSaveDto.getImage2());
        System.out.println("케이블" + chargingStationSaveDto.getCable());
        System.out.println("충전 타입" + chargingStationSaveDto.getChargeType());

        chargingStationService.insertChargingStation(chargingStationSaveDto);
    }
}
