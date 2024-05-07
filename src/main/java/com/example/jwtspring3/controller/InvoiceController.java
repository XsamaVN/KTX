package com.example.jwtspring3.controller;
import com.example.jwtspring3.model.Invoice;
import com.example.jwtspring3.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/invoices")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;
    @GetMapping
    public ResponseEntity<Iterable<Invoice>> findAll(){
        return new ResponseEntity<>(invoiceService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Invoice> addInvoice(@RequestBody Invoice invoice){
        return new ResponseEntity<>(invoiceService.save(invoice),HttpStatus.CREATED);
    }
}
