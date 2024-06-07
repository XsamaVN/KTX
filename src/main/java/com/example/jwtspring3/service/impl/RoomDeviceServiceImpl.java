package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.RoomDevice;
import com.example.jwtspring3.repository.RoomDeviceRepository;
import com.example.jwtspring3.service.RoomDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomDeviceServiceImpl implements RoomDeviceService {
    @Autowired
    RoomDeviceRepository roomDeviceRepository;
    @Override
    public RoomDevice save(RoomDevice roomDevice) {
        return roomDeviceRepository.save(roomDevice);
    }

    @Override
    public Iterable<RoomDevice> findAll(Long id) {
        return null;
    }

    @Override
    public Iterable<RoomDevice> findAllRoomId(Long id) {
        return roomDeviceRepository.findAllByRoomId(id);
    }

    @Override
    public void deleteAllByPropertyId(Long id) {

    }

    @Override
    public void deleteAllByRoomId(Long id) {
        roomDeviceRepository.deleteAllByRoomId(id);
    }

    @Override
    public void deleteById(Long id) {
        roomDeviceRepository.deleteById(id);
    }
}
