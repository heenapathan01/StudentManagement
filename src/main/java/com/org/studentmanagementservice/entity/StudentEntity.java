package com.org.studentmanagementservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "STUDENTS")
@Getter
@Setter
@Data
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue
    public Long id;

    @Column
    public String name;

    @Column
    public String grade;

    @Column
    public String mobileNumber;

    @Column
    public String schoolName;

    @Column
    public LocalDateTime createdAt;
}
