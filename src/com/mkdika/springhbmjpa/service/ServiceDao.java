package com.mkdika.springhbmjpa.service;

import com.mkdika.springhbmjpa.entity.Person;
import java.util.List;

/**
 *
 * @author Maikel
 */
public interface ServiceDao {
    
    public boolean save(Object obj);        

    public boolean delete(Object obj);
    
    public boolean truncateDb();
    
    public Person getPersonById(Integer id);
    
    public List<Person> getPersons();                           
}
