package com.knowledgewalls.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="CONSUMER_TYPE",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("General")
public class Consumer {
   @Id @GeneratedValue(strategy=GenerationType.AUTO)
   private int consumer_id;
   private String consumer_name;
    
   public int getConsumer_id() {
       return consumer_id;
   }
   public void setConsumer_id(int consumer_id) {
       this.consumer_id = consumer_id;
   }
   public String getConsumer_name() {
       return consumer_name;
   }
   public void setConsumer_name(String consumer_name) {
       this.consumer_name = consumer_name;
   }    
}