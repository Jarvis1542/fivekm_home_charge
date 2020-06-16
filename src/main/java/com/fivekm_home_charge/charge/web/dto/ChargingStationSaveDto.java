package com.fivekm_home_charge.charge.web.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
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

}
