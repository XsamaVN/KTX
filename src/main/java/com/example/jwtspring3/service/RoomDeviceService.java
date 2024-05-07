package com.example.jwtspring3.service;

import com.example.jwtspring3.model.RoomDevice;

public interface RoomDeviceService {
    RoomDevice save(RoomDevice roomDevice);
    Iterable<RoomDevice> findAll(Long id);
    Iterable<RoomDevice> findAllRoomId(Long id);
    void deleteAllByPropertyId (Long id);
}
