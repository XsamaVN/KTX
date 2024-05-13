package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.Room;
import com.example.jwtspring3.model.UserRoom;
import com.example.jwtspring3.repository.RoomRepository;
import com.example.jwtspring3.repository.UserRoomRepository;
import com.example.jwtspring3.service.UserRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRoomImpl implements UserRoomService {
    @Autowired
    UserRoomRepository userRoomRepository;
    @Autowired
    RoomRepository roomRepository;

    @Override
    public UserRoom save(UserRoom userRoom) {
        Long idRoom = userRoom.getRoom().getId();
        Optional<Room> room = roomRepository.findById(idRoom);
        room.get().setCurrentPresent(room.get().getCurrentPresent()+1);
        return userRoomRepository.save(userRoom);
    }

    @Override
    public Iterable<UserRoom> findAll() {
        return userRoomRepository.findAll();
    }

    @Override
    public Iterable<UserRoom> findAllByRoomId(Long id) {
        return userRoomRepository.findByRoomId(id);
    }

    @Override
    public Iterable<UserRoom> findByUserId(Long id) {
        return userRoomRepository.findByUserId(id);
    }
}
