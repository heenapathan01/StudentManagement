package com.org.studentmanagementservice.mapper;

import com.org.studentmanagementservice.entity.StudentEntity;
import com.org.studentmanagementservice.request.AddStudentRequest;
import com.org.studentmanagementservice.response.StudentResponseDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class StudentMapper {

    // mapper to map AddStudentRequest to StudentEntity object.
    public StudentEntity toStudentEntity(AddStudentRequest addStudentRequest) {

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setName(addStudentRequest.getName());
        studentEntity.setGrade(addStudentRequest.getGrade());
        studentEntity.setMobileNumber(addStudentRequest.getMobileNumber());
        studentEntity.setSchoolName(addStudentRequest.getSchoolName());
        studentEntity.setCreatedAt(LocalDateTime.now());

        return studentEntity;
    }

    public StudentResponseDTO toStudentResponseDTO(StudentEntity entity) {

        return StudentResponseDTO.builder()
                .Id(entity.getId())
                .name(entity.getName())
                .grade(entity.getGrade())
                .mobileNumber(entity.getMobileNumber())
                .schoolName(entity.getSchoolName())
                .build();
    }
}
