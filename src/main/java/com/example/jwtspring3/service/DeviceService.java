package com.example.jwtspring3.service;
import com.example.jwtspring3.model.Device;
public interface DeviceService {
    Device save(Device device);
    Iterable<Device> findAll();
}
