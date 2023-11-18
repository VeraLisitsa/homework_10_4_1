package com.example.homework_10_5_1.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonData implements Serializable {

    private String name;
    private String surname;
    private int age;
}

