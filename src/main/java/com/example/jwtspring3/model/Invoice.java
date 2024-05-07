package com.example.jwtspring3.model;

import jakarta.persistence.*;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Room room;
    @ManyToOne
    private User user;
    private String useElectricity;
    private String useWater;
    private Long servicePrice;
    private Long price;

    public Invoice(Long id, Room room, User user, String useElectricity, String useWater, Long servicePrice, Long price) {
        this.id = id;
        this.room = room;
        this.user = user;
        this.useElectricity = useElectricity;
        this.useWater = useWater;
        this.servicePrice = servicePrice;
        this.price = price;
    }

    public Invoice() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUseElectricity() {
        return useElectricity;
    }

    public void setUseElectricity(String useElectricity) {
        this.useElectricity = useElectricity;
    }

    public String getUseWater() {
        return useWater;
    }

    public void setUseWater(String useWater) {
        this.useWater = useWater;
    }

    public Long getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Long servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
