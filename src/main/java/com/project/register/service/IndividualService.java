package com.project.register.service;

import com.project.register.model.Individual;

import java.util.List;

public interface IndividualService {
    void addIndividual(Individual individual);
    void deleteIndividual(Individual individual);
    void updateIndividual( Individual individual);
    Individual getIndividualById(long id);
    List<Individual> getAllIndividuals();

}
