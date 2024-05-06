package com.example.jwtspring3.model;

import jakarta.persistence.*;

@Entity
public class RoomMonth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Room idRoom;
    private String month;

    public RoomMonth(Long id, Room idRoom, String month) {
        this.id = id;
        this.idRoom = idRoom;
        this.month = month;
    }

    public RoomMonth() {
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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
