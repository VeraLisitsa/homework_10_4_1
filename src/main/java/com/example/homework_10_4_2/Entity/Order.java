package com.example.homework_10_4_2.Entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "Orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;
    private String date;
    @Column(name = "customer_id")
    private long customerId;
    @Column(name = "product_name")
    private String productName;
    private int amount;
}
