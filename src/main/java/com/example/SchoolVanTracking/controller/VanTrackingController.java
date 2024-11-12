package com.example.SchoolVanTracking.controller;

import com.example.SchoolVanTracking.model.Student;
import com.example.SchoolVanTracking.service.VanTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VanTrackingController {

    @Autowired
    private VanTrackingService vanTrackingService;

    @GetMapping("/students/{routeId}")
    public List<Student> getStudentsByRoute(@PathVariable Long routeId) {
        return vanTrackingService.getStudentsByRoute(routeId);
    }

    @PutMapping("/students/{studentId}/status")
    public void updateStudentStatus(@PathVariable Long studentId, @RequestParam String status) {
        vanTrackingService.updateStudentStatus(studentId, status);
    }
}
