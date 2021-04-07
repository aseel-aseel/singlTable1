package com.knowledgewalls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.knowledgewalls.dao.ConsumerDAO;
import com.knowledgewalls.entity.Consumer;
import com.knowledgewalls.entity.InternetConsumer;
import com.knowledgewalls.entity.PhoneConsumer;
 
@Controller
public class StudentInfoController {
     
    @Autowired
    ConsumerDAO consumerDAO;
     
    @RequestMapping(value="/addConsumers",method=RequestMethod.GET)
    public @ResponseBody String addUsers(){
        {
            Consumer consumer = new Consumer();
                consumer.setConsumer_name("Consumer");
            consumerDAO.saveConsumer(consumer);
             
            PhoneConsumer phoneConsumer = new PhoneConsumer();
                phoneConsumer.setConsumer_name("Phone Consumer");
                phoneConsumer.setCallPlane("smarter");
            consumerDAO.savePhoneConsumer(phoneConsumer);
             
            InternetConsumer internetConsumer = new InternetConsumer();
                internetConsumer.setConsumer_name("Internet Consumer");
                internetConsumer.setPackName("fast plus");
            consumerDAO.saveInternetConsumer(internetConsumer);
        }
         
        return "Consumer saved successfully!";
    }
}