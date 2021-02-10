package com.project.register.controller;

import com.project.register.model.Individual;
import com.project.register.service.InnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class InnController {
    private InnServiceImpl innService;
    RestTemplate restTemplate;

    @Autowired
    public InnController(InnServiceImpl innService) {
        this.innService = innService;
        this.restTemplate=new RestTemplate();
    }

    @RequestMapping(value = "/rest/IndividualXML", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Individual getAllDBLogsXML() {
        Individual individual = null;
        try {
            individual = innService.queryAllDBLogsXML();  //JPA (Hibernate)
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(individual);
        return individual;
    }
    @RequestMapping(value = "/api/test",method = RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody ResponseEntity<String> getInn(){
        HttpEntity httpEntity=new HttpEntity(innService.queryAllDBLogsXML());
        System.out.println("ffFFFFFFFFF");
        return restTemplate.exchange("", HttpMethod.GET,httpEntity,String.class);
    }

}
