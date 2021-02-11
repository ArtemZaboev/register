package com.project.register.controller;

import com.project.register.config.SoapClientConfig;
import com.project.register.service.InnServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.gosuslugi.smev.rev111111.GetResponseType;


@RestController
public class InnController {
    RestTemplate restTemplate;

    @Autowired
    public InnController() {
        this.restTemplate=new RestTemplate();
    }

    @GetMapping(value = "/api/xml")
    public void getINN(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        InnServiceClient client = context.getBean(InnServiceClient.class);
        GetResponseType response = client.queryINNFLFIODR();
        System.out.println("response: inn"+ response.getMessageData());
    }


}
