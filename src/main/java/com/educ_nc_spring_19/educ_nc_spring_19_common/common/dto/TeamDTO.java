package com.educ_nc_spring_19.educ_nc_spring_19_common.common.dto;

import com.educ_nc_spring_19.educ_nc_spring_19_common.common.CreatedUpdatedDateByUser;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDTO {
    private UUID id;
    private String name;
    private UUID mentorId;
    private UUID backupId;
    private UUID stageId;
    private List<StudentDTO> students;
    @JsonUnwrapped
    private CreatedUpdatedDateByUser createdUpdatedDateByUser;
}