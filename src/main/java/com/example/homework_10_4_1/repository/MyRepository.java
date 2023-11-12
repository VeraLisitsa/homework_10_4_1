package com.example.homework_10_4_1.repository;

import com.example.homework_10_4_1.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyRepository {
    @PersistenceContext
    private EntityManager entityManager;
@Transactional
    public List<Person> getPersonsByCity(String city) {
var query = entityManager.createQuery("select person from Person person where person.city = :city");
query.setParameter("city", city);
        return query.getResultList();


    }
}
