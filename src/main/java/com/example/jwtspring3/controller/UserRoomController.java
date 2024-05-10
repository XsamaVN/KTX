package com.example.jwtspring3.controller;
import com.example.jwtspring3.model.UserRoom;
import com.example.jwtspring3.service.UserRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/users-room")
public class UserRoomController {
    @Autowired
    UserRoomService userRoomService;
    @GetMapping
    public ResponseEntity< Iterable<UserRoom>> findAll(){
        return new ResponseEntity<>(userRoomService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity addNew( @RequestBody UserRoom userRoom){
        return new ResponseEntity<>(userRoomService.save(userRoom),HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity< Iterable<UserRoom>> findAllByRoomId(@PathVariable Long id){
        return new ResponseEntity<>(userRoomService.findAllByRoomId(id), HttpStatus.OK);
    }

}
