package com.example.jwtspring3.service;

import com.example.jwtspring3.model.DTO;
import com.example.jwtspring3.model.Invoice;
import com.example.jwtspring3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface InvoiceService {
    Invoice save (Invoice invoice);
    Iterable<Invoice> findAll();

    List<DTO> getTotalByMonth();
}
