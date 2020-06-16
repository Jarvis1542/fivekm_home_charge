package com.fivekm_home_charge.charge.service;

import com.fivekm_home_charge.charge.mapper.HappyParkingMapper;
import com.fivekm_home_charge.charge.web.dto.HappyParkingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HappyParkingService {
    @Autowired(required = false)
    private HappyParkingMapper happyParkingMapper;

    public void insertHappyParking(HappyParkingDto happyParkingDto) throws Exception{
        happyParkingMapper.insertHappyParking(happyParkingDto);
    }
}
