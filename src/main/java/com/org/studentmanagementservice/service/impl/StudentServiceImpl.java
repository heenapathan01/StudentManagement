package com.org.studentmanagementservice.service.impl;

import com.org.studentmanagementservice.entity.StudentEntity;
import com.org.studentmanagementservice.mapper.StudentMapper;
import com.org.studentmanagementservice.repository.StudentRepository;
import com.org.studentmanagementservice.request.AddStudentRequest;
import com.org.studentmanagementservice.response.StudentResponseDTO;
import com.org.studentmanagementservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentResponseDTO addStudent(AddStudentRequest addStudentRequest) {
        // map request object to database entity object.
        StudentEntity studentEntity = studentMapper.toStudentEntity(addStudentRequest);
        // save studentEntity object into database.
        StudentEntity savedEnity = studentRepository.save(studentEntity);
        // map savedEntity to studentResponseDto object.
        return studentMapper.toStudentResponseDTO(savedEnity);
    }

    @Override
    public StudentResponseDTO fetchStudentDetailsById(Long studentId) {

        return studentMapper.toStudentResponseDTO(studentRepository.getReferenceById(studentId));
    }
}
