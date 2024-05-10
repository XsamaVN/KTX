package com.example.jwtspring3.service;

import com.example.jwtspring3.model.UserRoom;

public interface UserRoomService {
    void save(UserRoom userRoom);
    Iterable<UserRoom> findAll();
    Iterable<UserRoom> findAllByRoomId(Long id);
    Iterable<UserRoom> findByUserId(Long id);
}
