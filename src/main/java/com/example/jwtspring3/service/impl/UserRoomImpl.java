package com.example.jwtspring3.service.impl;

import com.example.jwtspring3.model.UserRoom;
import com.example.jwtspring3.repository.UserRoomRepository;
import com.example.jwtspring3.service.UserRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoomImpl implements UserRoomService {
    @Autowired
    UserRoomRepository userRoomRepository;
    @Override
    public void save(UserRoom userRoom) {
        userRoomRepository.save(userRoom);
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
