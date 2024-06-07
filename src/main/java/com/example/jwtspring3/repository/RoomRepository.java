package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    Iterable<Room> findAllByType(String type);
    Iterable<Room> findAllByTypeAndAndNameContaining(String type,String name);
}
