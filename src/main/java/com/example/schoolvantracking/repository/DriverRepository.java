package com.example.schoolvantracking.repository;

import com.example.schoolvantracking.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
