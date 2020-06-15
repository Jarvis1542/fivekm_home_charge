package com.fivekm_home_charge.charge.mapper;

import com.fivekm_home_charge.charge.web.dto.MemberDto;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface MemberMapper {
    public ArrayList<MemberDto> getMembers() throws Exception;
    public void insertMembers(MemberDto memberDto) throws Exception;
    public MemberDto getMember(@Param("id")String id, @Param("password")String password) throws Exception;
}
