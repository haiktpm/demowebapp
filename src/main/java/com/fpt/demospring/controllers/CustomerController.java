package com.fpt.demospring.controllers;

import com.fpt.demospring.models.Customer;
import com.fpt.demospring.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping(path = "")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(path="/customer")
    public String getAllUsers(Model model) {
        Iterable<Customer> listCustomer = customerRepository.findAll();
        Iterator<Customer> iterListCustomer = listCustomer.iterator();
        List<Customer> list = new ArrayList<>();
        iterListCustomer.forEachRemaining(list::add);

        model.addAttribute("customers", list);

        return "customer";
    }

}
