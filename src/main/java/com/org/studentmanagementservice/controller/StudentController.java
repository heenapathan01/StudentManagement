package com.org.studentmanagementservice.controller;

import com.org.studentmanagementservice.request.AddStudentRequest;
import com.org.studentmanagementservice.response.StudentResponseDTO;
import com.org.studentmanagementservice.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class to add, fetch student details.
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentResponseDTO addStudent(@Valid @RequestBody AddStudentRequest addStudentRequest) {
        return studentService.addStudent(addStudentRequest);
    }

    @GetMapping("/{id}")
    public StudentResponseDTO fetchStudentById(@PathVariable("id") Long studentId) {
        return studentService.fetchStudentDetailsById(studentId);
    }
}
