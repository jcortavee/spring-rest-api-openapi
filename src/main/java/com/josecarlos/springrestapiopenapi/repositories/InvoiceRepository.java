package com.josecarlos.springrestapiopenapi.repositories;


import com.josecarlos.springrestapiopenapi.models.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}
