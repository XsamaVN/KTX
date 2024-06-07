package com.example.jwtspring3.controller;
import com.example.jwtspring3.model.Room;
import com.example.jwtspring3.service.RoomService;
import com.example.jwtspring3.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping
    public ResponseEntity<Iterable<Room>> showAllRoom(String type, String name) {
        Iterable<Room> rooms = roomService.findAll(type, name);
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Room>> getOneRoom(@PathVariable Long id){
        Optional<Room> room = roomService.findRoomById(id);
        return new ResponseEntity<>(room,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addRoom(@RequestBody Room room) {
        return new ResponseEntity<>(roomService.save(room), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Room room) {
        Iterable<Room> rooms = roomService.findAll();
        for (Room item : rooms) {
            if (item.getId()!=room.getId()){
                if (item.getName().equals(room.getName())) {
                    return new ResponseEntity<>("Room name existed", HttpStatus.OK);
                }
            }
        }
        Room room1 = new Room();
        room1.setId(id);
        room1.setName(room.getName());
        room1.setCurrentPresent(room.getCurrentPresent());
        room1.setMaxCurrent(room.getMaxCurrent());
        room1.setDescription(room.getDescription());
        room1.setImg(room.getImg());
        room1.setType(room.getType());
        room1.setPrice(room.getPrice());
        roomService.save(room1);
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        roomService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
