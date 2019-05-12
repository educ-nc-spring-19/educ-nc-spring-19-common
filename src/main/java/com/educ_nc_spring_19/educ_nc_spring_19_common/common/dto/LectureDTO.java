package com.educ_nc_spring_19.educ_nc_spring_19_common.common.dto;

import com.educ_nc_spring_19.educ_nc_spring_19_common.common.Audit;
import com.educ_nc_spring_19.educ_nc_spring_19_common.common.DayOfWeekTime;
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
public class LectureDTO {
    private UUID id;
    private UUID directionId;
    private OffsetDateTime firstLecture;
    @JsonUnwrapped
    private Audit audit;
    private Set<DayOfWeekTime> lectureDays;
}
