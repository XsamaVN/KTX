package com.example.jwtspring3.repository;

import com.example.jwtspring3.model.RoomDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomDeviceRepository extends JpaRepository<RoomDevice,Long> {
    Iterable<RoomDevice> findAllByRoomId(Long id);
    void deleteAllByRoomId(Long id);
}
