package com.project.register.dao;

import com.project.register.model.Individual;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Set;

public interface IndividualDao {
    void delete(Individual individual);
    void deleteById(long individualId);
    Individual save(Individual individual);
    Individual update(Individual individual);
    Set<Individual> getAllIndividuals();
    Individual getIndividualById(long id);
}
