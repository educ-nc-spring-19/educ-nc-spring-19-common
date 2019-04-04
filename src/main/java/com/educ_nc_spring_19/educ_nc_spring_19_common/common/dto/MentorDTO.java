package com.educ_nc_spring_19.educ_nc_spring_19_common.common.dto;

import com.educ_nc_spring_19.educ_nc_spring_19_common.common.CreatedUpdatedDateByUser;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MentorDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String description;
    private UUID userId;
    private UUID directionId;
    private String acronym;
    private String externalId;
    @JsonUnwrapped
    private CreatedUpdatedDateByUser createdUpdatedDateByUser;
}
