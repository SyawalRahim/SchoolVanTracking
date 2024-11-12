package com.example.schoolvantracking.repository;

import com.example.schoolvantracking.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
