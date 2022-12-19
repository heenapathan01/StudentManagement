package com.org.studentmanagementservice.service;

import com.org.studentmanagementservice.request.AddStudentRequest;
import com.org.studentmanagementservice.response.StudentResponseDTO;

public interface StudentService {

    // Method used to add new student record.
    StudentResponseDTO addStudent(AddStudentRequest addStudentRequest);

    // Method used to fetch student details by studentId.
    StudentResponseDTO fetchStudentDetailsById(Long movieId);
}
