package com.project.register.controller;

import com.project.register.model.Individual;
import com.project.register.service.IndividualServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class IndividualController {
    private IndividualServiceImpl individualService;

    @Autowired
    public IndividualController(IndividualServiceImpl individualService) {
        this.individualService = individualService;
    }
    @GetMapping("/")
    public String getAllIndividuals(Model model){
        List<Individual> individuals=individualService.getAllIndividuals();
        model.addAttribute("persons",individuals);
        return "index";
    }
}
