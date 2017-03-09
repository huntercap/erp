package com.cx.erp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/3/5.
 */
public class BaseDao{
    private  SessionFactory sessionFactory;
    /**
     * set method
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        System.out.println("1:setSessionFactory");
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
