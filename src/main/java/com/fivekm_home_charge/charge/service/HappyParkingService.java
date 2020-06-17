package com.fivekm_home_charge.charge.service;

import com.fivekm_home_charge.charge.mapper.HappyParkingMapper;
import com.fivekm_home_charge.charge.web.dto.HappyParkingDto;
import com.fivekm_home_charge.charge.web.dto.HappyParkingRequestListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HappyParkingService {
    @Autowired(required = false)
    private HappyParkingMapper happyParkingMapper;

    public void insertHappyParking(HappyParkingDto happyParkingDto) throws Exception{
        happyParkingMapper.insertHappyParking(happyParkingDto);
    }

    public HappyParkingDto requestHappyParking(String parkingName) throws Exception{
        return happyParkingMapper.requestHappyParking( parkingName);
    }

    public ArrayList<HappyParkingRequestListDto> happyParkingRequestList() throws Exception{
        return happyParkingMapper.happyParkingRequestList();
    }
}
