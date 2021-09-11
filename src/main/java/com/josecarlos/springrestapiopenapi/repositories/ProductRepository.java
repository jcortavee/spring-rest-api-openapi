package com.josecarlos.springrestapiopenapi.repositories;

import com.josecarlos.springrestapiopenapi.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
