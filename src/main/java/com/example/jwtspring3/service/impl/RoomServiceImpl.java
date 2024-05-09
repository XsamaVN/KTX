package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Room;
import com.example.jwtspring3.repository.RoomRepository;
import com.example.jwtspring3.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;
    @Override
    public Room save(Room room) {
       return roomRepository.save(room);
    }

    @Override
    public Optional<Room> findRoomById(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
    @Override
    public Iterable<Room> findAll(String type, Long id) {
        if(type != null){

            return roomRepository.findAllByType(type);
        }
        else if(id != null) {
            List<Room> roomList = new ArrayList<>();
            Optional<Room> var10000 = this.roomRepository.findById(id);
            Objects.requireNonNull(roomList);
            var10000.ifPresent(roomList::add);
            return roomList;
        }
        else {
            return roomRepository.findAll();
        }

    }
}
