package com.project.register.service;

import com.project.register.model.Individual;
import com.project.register.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InnServiceImpl implements InnService {
    private SessionFactory sessionFactory;

    @Autowired
    public InnServiceImpl() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    @Override
    public String getInnForIndividual() {
        return null;
    }
    public Individual queryAllDBLogsXML() {
        System.out.println("DBLogService queryAllDBLogsXML() is called");
        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        Individual individual=session.createQuery("from Individual where id=1",Individual.class).getSingleResult();
        session.getTransaction().commit();
        return individual;
    }

}
