package com.example.jwtspring3.model;

import jakarta.persistence.*;

@Entity
public class RoomDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Room idRoom;
    @ManyToOne
    private Device idDevice;
    private String status;

    public RoomDevice(Long id, Room idRoom, Device idDevice, String status) {
        this.id = id;
        this.idRoom = idRoom;
        this.idDevice = idDevice;
        this.status = status;
    }

    public RoomDevice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Room idRoom) {
        this.idRoom = idRoom;
    }

    public Device getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(Device idDevice) {
        this.idDevice = idDevice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
