package com.example.jwtspring3.controller;
import com.example.jwtspring3.model.Room;
import com.example.jwtspring3.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin("*")
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping
    public ResponseEntity<Iterable<Room>> showAllRoom() {
        Iterable<Room> rooms = roomService.findAll();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Room> addRoom(@RequestBody Room room) {
        return new ResponseEntity<>(roomService.save(room), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Room> update(@PathVariable Long id, @RequestBody Room room) {
        room.setId(id);
        roomService.save(room);
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        roomService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
