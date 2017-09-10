package com.backend.Dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
 
public abstract class AbstractDao {
    @Autowired
    public SessionFactory sessionFactory;
 
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
 
    public void persist(Object entity) {
        getSession().merge(entity);
    }
 
    public void delete(Object entity) {
        getSession().delete(entity);
    }

}
