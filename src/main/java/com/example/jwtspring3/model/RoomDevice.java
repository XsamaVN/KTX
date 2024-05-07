package com.example.jwtspring3.model;

import jakarta.persistence.*;

@Entity
public class RoomDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Room room;
    @ManyToOne
    private Device device;
    private String status;

    public RoomDevice() {
    }

    public RoomDevice(Long id, Room room, Device device, String status) {
        this.id = id;
        this.room = room;
        this.device = device;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public Device getDevice() {
        return device;
    }

    public String getStatus() {
        return status;
    }
}
