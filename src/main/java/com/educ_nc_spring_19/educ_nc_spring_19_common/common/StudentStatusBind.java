package com.educ_nc_spring_19.educ_nc_spring_19_common.common;

import com.educ_nc_spring_19.educ_nc_spring_19_common.common.enums.StudentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
public class StudentStatusBind {
    @Column(name = "student_id", nullable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StudentStatus status;
}
