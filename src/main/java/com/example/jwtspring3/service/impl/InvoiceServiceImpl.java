package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Invoice;
import com.example.jwtspring3.model.Room;
import com.example.jwtspring3.repository.InvoiceRepository;
import com.example.jwtspring3.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    @Autowired
    RoomServiceImpl roomService;
    @Override
    public Invoice save(Invoice invoice) {
        Optional<Room> room = roomService.findRoomById(invoice.getRoom().getId());
        return invoiceRepository.save(invoice);
    }

    @Override
    public Iterable<Invoice> findAll() {
        return invoiceRepository.findAll();
    }
}
