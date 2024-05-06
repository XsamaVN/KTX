package com.example.jwtspring3.model;

import jakarta.persistence.*;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Room idRoom;
    @ManyToOne
    private User idUser;
    private String useElectricity;
    private String useWater;
    private Long servicePrice;
    private Long price;

    public Invoice(Long id, Room idRoom, User idUser, String useElectricity, String useWater, Long servicePrice, Long price) {
        this.id = id;
        this.idRoom = idRoom;
        this.idUser = idUser;
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

    public Room getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Room idRoom) {
        this.idRoom = idRoom;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
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
