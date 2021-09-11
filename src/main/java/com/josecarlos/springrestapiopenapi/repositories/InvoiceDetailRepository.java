package com.josecarlos.springrestapiopenapi.repositories;

import com.josecarlos.springrestapiopenapi.models.InvoiceDetail;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDetailRepository extends CrudRepository<InvoiceDetail, Long> {
}
