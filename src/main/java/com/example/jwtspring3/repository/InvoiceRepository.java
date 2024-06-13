package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.DTO;
import com.example.jwtspring3.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
    @Query("SELECT DATE_FORMAT(STR_TO_DATE(i.startDate, '%d/%m/%Y'), '%Y-%m') AS month, " +
            "SUM(i.price) AS total " +
            "FROM Invoice i " +
            "GROUP BY DATE_FORMAT(STR_TO_DATE(i.startDate, '%d/%m/%Y'), '%Y-%m') " +
            "ORDER BY DATE_FORMAT(STR_TO_DATE(i.startDate, '%d/%m/%Y'), '%Y-%m')")
    List<DTO> getTotalByMonth();

}
