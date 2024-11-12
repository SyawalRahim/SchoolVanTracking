package com.example.schoolvantracking.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String status;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    // Getters and Setters
}
