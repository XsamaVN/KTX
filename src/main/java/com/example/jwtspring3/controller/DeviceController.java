package com.example.jwtspring3.controller;

import com.example.jwtspring3.model.Device;
import com.example.jwtspring3.model.Room;
import com.example.jwtspring3.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class DeviceController {
    @Autowired
    DeviceService deviceService;

    @GetMapping("/show-device")
    public ResponseEntity<Iterable<Device>> findAll() {
        Iterable<Device> devices = deviceService.findAll();
        return new ResponseEntity<>(devices , HttpStatus.OK);
    }
    @PostMapping("/add-device")
    public ResponseEntity<Device> addDevice(@RequestBody Device device ){
        return new ResponseEntity<>(deviceService.save(device),HttpStatus.CREATED);
    }
}
