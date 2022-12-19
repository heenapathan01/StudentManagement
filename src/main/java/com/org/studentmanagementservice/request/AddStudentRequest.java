package com.org.studentmanagementservice.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AddStudentRequest implements Serializable {

    @ApiModelProperty("Name of student")
    @NotNull(message = "Student name should not be null.")
    public String name;

    @ApiModelProperty("Grade of student for admission")
    @NotNull(message = "Student grade of admission should not be null.")
    public String grade;

    @ApiModelProperty("Student mobile number")
    @NotNull(message = "Student mobile number should not be null.")
    @Size(min = 10, max = 13)
    public String mobileNumber;

    @ApiModelProperty("School name for student admission")
    @NotNull(message = "School name for student admission should not be null.")
    public String schoolName;
}
