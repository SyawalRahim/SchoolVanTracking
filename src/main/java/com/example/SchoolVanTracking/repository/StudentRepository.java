package com.example.SchoolVanTracking.repository;

import com.example.SchoolVanTracking.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
