package com.educ_nc_spring_19.educ_nc_spring_19_common.common.dto;

import com.educ_nc_spring_19.educ_nc_spring_19_common.common.Audit;
import com.educ_nc_spring_19.educ_nc_spring_19_common.common.DayOfWeekTime;
import com.educ_nc_spring_19.educ_nc_spring_19_common.common.StudentStatusBind;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupDTO {
    private UUID id;
    private String name;
    private UUID mentorId;
    private UUID backupId;
    private UUID stageId;
    private OffsetDateTime firstMeetingDate;
    @JsonUnwrapped
    private Audit audit;
    private Set<StudentStatusBind> students;
    private Set<DayOfWeekTime> meetings;
}
