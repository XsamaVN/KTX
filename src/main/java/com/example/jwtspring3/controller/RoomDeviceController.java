package com.example.jwtspring3.controller;

import com.example.jwtspring3.model.RoomDevice;
import com.example.jwtspring3.service.RoomDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/rooms-device")
public class RoomDeviceController {
    @Autowired
    RoomDeviceService roomDeviceService;

    @GetMapping
    public ResponseEntity<Iterable<RoomDevice>> findAll(Long id){
        return new ResponseEntity<>(roomDeviceService.findAllRoomId(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<RoomDevice> addRoomDevice(@RequestBody RoomDevice roomDevice){
        return new ResponseEntity<>(roomDeviceService.save(roomDevice),HttpStatus.CREATED);
    }
}
