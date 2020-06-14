package com.fivekm_home_charge.charge.web.dto;

import lombok.Data;

@Data
public class MemberDto {
    private final String id;
    private final String password;
    private final String email;

    public String toString() {
        return "id :    " + id + "     password :    " + password + "      email : " + email;
    }

}
