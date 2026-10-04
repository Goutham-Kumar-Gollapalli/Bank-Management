package com.bank_management.demo.controller;

import com.bank_management.demo.entity.Customer;
import com.bank_management.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {


        @Autowired
        private CustomerService customerService;

        @PostMapping("/add")
        public Customer AddCustomer(@RequestBody Customer customer){
                System.out.println("customer recieved :"+customer);
                return customerService.customerAdd(customer);
        }

        @GetMapping("/display")
        public List<Customer> findAll(){
                return customerService.findAll();
        }
}
