package com.mkdika.springhbmjpa.service;

import com.mkdika.springhbmjpa.entity.Person;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Maikel
 */
@Service("serviceDao")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class ServiceDaoImpl implements ServiceDao {

    @Autowired
    private SessionFactory sessionFactory;

    public final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional(readOnly = false)
    public boolean save(Object obj) {
        getCurrentSession().saveOrUpdate(obj);
        return true;
    }

    @Override
    @Transactional(readOnly = false)
    public boolean delete(Object obj) {
        getCurrentSession().delete(obj);
        return true;
    }
    
    @Override
    @Transactional(readOnly = false)
    public boolean truncateDb() {
        getCurrentSession().createSQLQuery("DELETE FROM coderclub.person;").executeUpdate();
        return true;
    }

    @Override
    public Person getPersonById(Integer id) {
        Person t = (Person) getCurrentSession().get(Person.class, id);
        return t;
    }

    @Override
    public List<Person> getPersons() {
        List<Person> list = getCurrentSession().createQuery("FROM Person a ORDER BY a.personname ASC").list();
        return list;
    }   
}
