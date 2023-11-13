package com.example.homework_10_4_3.controller;

import com.example.homework_10_4_3.entity.Person;
import com.example.homework_10_4_3.repository.MyRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MyController {

    private MyRepository repository;


    @GetMapping("/persons/by-city")
    public List<Person> getByCity(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }
}
