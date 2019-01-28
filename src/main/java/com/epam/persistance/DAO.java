package com.epam.persistance;

import com.epam.model.Student;
import com.epam.model.Tutor;
import com.epam.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DAO {

    private SessionFactory sessionFactory;

    public DAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Iterable<Tutor> findAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query<Tutor> query = session.createQuery("select t from Tutor as t");
        List resultList = query.getResultList();
        session.getTransaction().commit();
        return resultList;
    }

}
