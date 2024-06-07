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
    private Long quantity;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
