package com.project.register.service;

import com.project.register.model.Individual;
import com.project.register.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class IndividualServiceImpl implements IndividualService{

    private SessionFactory sessionFactory;

    @Autowired
    public IndividualServiceImpl() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Individual addIndividual() {
        return null;
    }

    @Override
    public void removeIndividual() {

    }

    @Override
    public Individual updateIndividual() {
        return null;
    }

    @Override
    public Individual getIndividual() {
        return null;
    }

    @Override
    public List<Individual> getAllIndividuals() {
        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Individual> individuals=session.createQuery("from Individual ").list();
        session.getTransaction().commit();
        return individuals;
    }
}
