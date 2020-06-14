package com.fivekm_home_charge.charge.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ChargingStationSaveDto {
    private String chargeName;//충전소이름
    private String operation; //운영기관
    private LocalDateTime operationTime;//운영시간
    private String chargeSpeed; //충전속도
    private String addr1; //주소
    private String addr2; //상세주소
    private String image1; //사진1
    private String image2; //사진 2
    private String cable; //케이블유무
    private String chargeType; //충전소타입


    @Builder
    public ChargingStationSaveDto(String chargeName, String operation, LocalDateTime operationTime,
                                  String chargeSpeed, String addr1, String addr2, String image1, String image2,
                                  String cable, String chargeType){

        this.chargeName = chargeName;
        this.operation = operation;
        this.operationTime = operationTime;
        this.chargeSpeed = chargeSpeed;
        this.addr1 = addr1;
        this.addr2= addr2;
        this.image1 = image1;
        this.image2 = image2;
        this.cable = cable;
        this.chargeType = chargeType;

    }

}
