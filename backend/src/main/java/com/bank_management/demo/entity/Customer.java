package com.bank_management.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String phone;
    @Column(unique = true,nullable = false)
    private String email;
    private String address;
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "customer")//as look there
    private List<Account> accounts;
}
