package com.knowledgewalls.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
 
@Entity
@DiscriminatorValue("iCall")
public class PhoneConsumer extends Consumer {
    private String callPlane;
 
    public String getCallPlane() {
        return callPlane;
    }
    public void setCallPlane(String callPlane) {
        this.callPlane = callPlane;
    }
}