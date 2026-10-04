package com.bank_management.demo.entity;

import jakarta.persistence.*;
import lombok.extern.apachecommons.CommonsLog;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(unique = true,nullable = false)
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private BigDecimal balance;
    private AccountStatus status;
    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name="customer_id",nullable = false)
    private Customer customer;
}
