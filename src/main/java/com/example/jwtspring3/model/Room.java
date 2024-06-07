package com.example.jwtspring3.model;

import jakarta.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
    private int maxCurrent;
    private int currentPresent;
    private String description;
    @Column(length = 1000)
    private String img;
    private Double price;
    private String type;

    public Room(Long id, String name, int maxCurrent, int currentPresent, String description, String img, Double price, String type) {
        this.id = id;
        this.name = name;
        this.maxCurrent = maxCurrent;
        this.currentPresent = currentPresent;
        this.description = description;
        this.img = img;
        this.price = price;
        this.type = type;
    }

    public Room() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCurrent() {
        return maxCurrent;
    }

    public void setMaxCurrent(int maxCurrent) {
        this.maxCurrent = maxCurrent;
    }

    public int getCurrentPresent() {
        return currentPresent;
    }

    public void setCurrentPresent(int currentPresent) {
        this.currentPresent = currentPresent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
