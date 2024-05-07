package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DeviceRepository extends JpaRepository<Device,Long> {
}
