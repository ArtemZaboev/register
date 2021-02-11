package com.project.register.controller;

import com.project.register.model.Individual;
import com.project.register.service.IndividualServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
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
        return "individual-table";
    }

    @GetMapping("/add-individual")
    public String showAddIndividualPage(ModelMap model) {
        model.addAttribute("individual", new Individual());
        return "add-individual";
    }

    @GetMapping(value = "/delete-individual")
    public String deleteTodo(@RequestParam long id) {
        individualService.deleteIndividual(id);
        return "redirect:/";
    }

    @GetMapping(value = "/update-individual")
    public String showUpdateTodoPage(@RequestParam long id, ModelMap model) {
        Individual individual = individualService.getIndividualById(id);
        model.put("individual", individual);
        return "add-individual";
    }

    @PostMapping(value = "/update-individual")
    public String updateTodo(ModelMap model, @Valid Individual individual, BindingResult result) {

        if (result.hasErrors()) {
            return "add-individual";
        }
        individualService.updateIndividual(individual);
        return "redirect:/";
    }

    @PostMapping(value = "/add-individual")
    public String addTodo(ModelMap model, @Valid Individual individual, BindingResult result) {

        if (result.hasErrors()) {
            return "add-individual";
        }
        individualService.addIndividual(individual);
        return "redirect:/";
    }
}
