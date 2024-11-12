package com.example.SchoolVanTracking.service;

import com.example.SchoolVanTracking.model.Student;
import com.example.SchoolVanTracking.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VanTrackingService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentsByRoute(Long routeId) {
        return studentRepository.findAllByRouteId(routeId);
    }

    public void updateStudentStatus(Long studentId, String status) {
        Student student = studentRepository.findById(studentId).orElseThrow();
        student.setStatus(status);
        studentRepository.save(student);
    }
}
