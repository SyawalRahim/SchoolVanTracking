package com.example.SchoolVanTracking.repository;

import com.example.SchoolVanTracking.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
