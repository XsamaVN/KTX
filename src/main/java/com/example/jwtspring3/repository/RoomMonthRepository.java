package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.RoomMonth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomMonthRepository extends JpaRepository<RoomMonth,Long> {
}
