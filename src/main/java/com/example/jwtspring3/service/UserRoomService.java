package com.example.jwtspring3.service;

import com.example.jwtspring3.model.UserRoom;

public interface UserRoomService {
    UserRoom save(UserRoom userRoom);
    Iterable<UserRoom> findAll();
    Iterable<UserRoom> findAllByRoomId(Long id);

}
