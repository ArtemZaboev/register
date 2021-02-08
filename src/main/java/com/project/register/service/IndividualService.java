package com.project.register.service;

import com.project.register.model.Individual;

import java.util.List;

public interface IndividualService {
    Individual addIndividual();
    void removeIndividual();
    Individual updateIndividual();
    Individual getIndividual();
    List<Individual> getAllIndividuals();

}
