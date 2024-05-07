package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Invoice;
import com.example.jwtspring3.repository.InvoiceRepository;
import com.example.jwtspring3.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    @Override
    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Iterable<Invoice> findAll() {
        return invoiceRepository.findAll();
    }
}
