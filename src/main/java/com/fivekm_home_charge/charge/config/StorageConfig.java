package com.fivekm_home_charge.charge.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class StorageConfig {
    private String location;

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
}
