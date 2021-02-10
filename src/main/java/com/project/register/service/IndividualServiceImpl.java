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
    public void addIndividual(Individual individual) {
        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(individual);
        session.getTransaction().commit();
    }

    @Override
    public void deleteIndividual(Individual individual) {
        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(individual);
        session.getTransaction().commit();
    }

    @Override
    public void updateIndividual(Individual individual) {
        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(individual);
        session.getTransaction().commit();
    }

    @Override
    public Individual getIndividualById(long id) {
        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        Individual individual= session
                .createQuery("from Individual ind where ind.id="+id,Individual.class)
                .getSingleResult();
        session.getTransaction().commit();
        if (individual==null){
            throw new NullPointerException("Individual with id="+id+" was not find.");
        }
        return individual;
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
