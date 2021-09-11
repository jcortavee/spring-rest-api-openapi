package com.josecarlos.springrestapiopenapi.repositories;

import com.josecarlos.springrestapiopenapi.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
