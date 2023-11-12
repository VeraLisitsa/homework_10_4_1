package com.example.homework_10_4_2.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MyRepository {

    @PersistenceContext
    private EntityManager entityManager;
    private String scriptFileName = "myScript.sql";

    private String script;

    public MyRepository() {
        this.script = read(scriptFileName);

    }

    public static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductName(String name) {
        var entity = entityManager.createQuery(script, String.class);
        entity.setParameter("name", name);
        return entity.getResultList();
    }
}
