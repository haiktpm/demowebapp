package com.fpt.demospring.repositories;

import com.fpt.demospring.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
