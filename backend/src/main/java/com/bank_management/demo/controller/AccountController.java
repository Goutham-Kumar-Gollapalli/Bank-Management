package com.bank_management.demo.controller;

import com.bank_management.demo.Repository.CustomerRepository;
import com.bank_management.demo.entity.Customer;
import com.bank_management.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class AccountController
{

//    @Autowired
//    private CustomerService customerService;
//
//    @PostMapping("/add")
//    public Customer AddCustomer(@RequestBody Customer customer){
//        return customerService.customerAdd(customer);
//    }
}
