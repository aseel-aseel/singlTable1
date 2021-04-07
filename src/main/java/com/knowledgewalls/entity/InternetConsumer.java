package com.knowledgewalls.entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
 
@Entity
@DiscriminatorValue("iNet")
public class InternetConsumer extends Consumer {
    private String packName;
 
    public String getPackName() {
        return packName;
    }
 
    public void setPackName(String packName) {
        this.packName = packName;
    }    
}