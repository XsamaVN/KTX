package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Room;
import com.example.jwtspring3.repository.RoomRepository;
import com.example.jwtspring3.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;
    @Override
    public Room save(Room room) {
       return roomRepository.save(room);
    }

    public Iterable<Room> findAll(Long id) {
        if (id != null) {
            List<Room> roomList = new ArrayList<>();
            roomRepository.findById(id).ifPresent(roomList::add);
            return roomList;
        }
        return roomRepository.findAll();
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
    public Iterable<Room> findAll(String type) {
        if(type == null){
            return roomRepository.findAll();
        }
        else {
            return roomRepository.findAllByType(type);
        }

    }
}
