package com.example.jwtspring3.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 1000)
    private String img;
    private int quantity;
    public Device(Long id, String name, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }
    public Device() {
    }
}
