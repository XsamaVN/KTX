package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.UserRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoomRepository extends JpaRepository<UserRoom , Long> {
    Iterable<UserRoom> findByRoomId(Long id);
}
