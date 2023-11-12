package com.example.homework_10_4_2.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "Customers")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    private String name;

    private String surname;

    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Order> orders;
}
