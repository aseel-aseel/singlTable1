package com.knowledgewalls.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.knowledgewalls.entity.Consumer;
import com.knowledgewalls.entity.InternetConsumer;
import com.knowledgewalls.entity.PhoneConsumer;

@Repository
@Transactional
public class ConsumerDAO {
    
   @PersistenceContext
   EntityManager em;
    
   public void saveConsumer(Consumer consumer){
       try {
           em.persist(consumer);
       }
       catch(Exception e){
           e.printStackTrace();
       }
   }
    
   public void savePhoneConsumer(PhoneConsumer consumer){
       try {
           em.persist(consumer);
       }
       catch(Exception e){
           e.printStackTrace();
       }
   }
    
   public void saveInternetConsumer(InternetConsumer consumer){
       try {
           em.persist(consumer);
       }
       catch(Exception e){
           e.printStackTrace();
       }
   }
}