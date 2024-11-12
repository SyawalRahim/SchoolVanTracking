package com.example.schoolvantracking.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "driver")
    private List<Route> routes;

    // Getters and Setters
}
