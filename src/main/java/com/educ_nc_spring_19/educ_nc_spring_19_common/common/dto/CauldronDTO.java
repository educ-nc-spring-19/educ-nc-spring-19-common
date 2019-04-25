package com.educ_nc_spring_19.educ_nc_spring_19_common.common.dto;

import com.educ_nc_spring_19.educ_nc_spring_19_common.common.Audit;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CauldronDTO {
    private UUID id;
    private String name;
    private String description;
    private Set<UUID> mentors;
    private Set<UUID> students;
    @JsonUnwrapped
    private Audit audit;
}
