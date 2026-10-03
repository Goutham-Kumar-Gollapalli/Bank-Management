package com.bank_management.demo.service;

import com.bank_management.demo.Repository.AccountRepository;
import com.bank_management.demo.Repository.CustomerRepository;
import com.bank_management.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer customerAdd(Customer customer)
    {
        return customerRepository.save(customer);
    }
}
