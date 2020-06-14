package com.fivekm_home_charge.charge.mapper;

import com.fivekm_home_charge.charge.web.dto.MemberDto;

import java.util.ArrayList;

public interface MemberMapper {
    public ArrayList<MemberDto> getMembers() throws Exception;
    public void insertMembers(MemberDto memberDto) throws Exception;
}
