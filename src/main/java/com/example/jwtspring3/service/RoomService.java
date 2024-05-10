package com.example.jwtspring3.service;
import com.example.jwtspring3.model.Room;

import java.util.Optional;

public interface RoomService {
    Room save(Room room);

    Optional<Room> findRoomById(Long id);
    void delete(Long id);

    Iterable<Room> findAll(String type);


}
