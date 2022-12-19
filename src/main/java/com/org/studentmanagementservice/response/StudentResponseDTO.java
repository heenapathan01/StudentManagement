package com.org.studentmanagementservice.response;

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
@Builder
public class StudentResponseDTO implements Serializable {

    @ApiModelProperty("Student Id.")
    Long Id;

    @ApiModelProperty("Name of student")
    public String name;

    @ApiModelProperty("Grade of student for admission")
    public String grade;

    @ApiModelProperty("Student mobile number")
    public String mobileNumber;

    @ApiModelProperty("School name for student admission")
    public String schoolName;
}
