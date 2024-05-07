package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Device;
import com.example.jwtspring3.repository.DeviceRepository;
import com.example.jwtspring3.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceRepository deviceRepository;


    @Override
    public Device save(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public Iterable<Device> findAll() {
        return deviceRepository.findAll();
    }
}
