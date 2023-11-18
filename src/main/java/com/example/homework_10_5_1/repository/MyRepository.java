package com.example.homework_10_5_1.repository;

import com.example.homework_10_5_1.entity.Person;
import com.example.homework_10_5_1.entity.PersonData;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MyRepository extends JpaRepository<Person, PersonData> {

    public List<Person> findByCity(String city);

    public List<Person> findByPersonData_AgeLessThan(int age, Sort sort);

    public Optional<Person> findByPersonData_NameAndPersonData_Surname(String name, String surname);
}
