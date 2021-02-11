package com.project.register.service;

import com.project.register.model.Individual;

import java.util.List;

public interface IndividualService {
    void addIndividual(Individual individual);
    void deleteIndividual(long id);
    void updateIndividual( Individual individual);
    Individual getIndividualById(long id);
    List<Individual> getAllIndividuals();

}
