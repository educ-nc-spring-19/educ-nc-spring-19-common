package com.educ_nc_spring_19.educ_nc_spring_19_common.common;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data

@Embeddable
public class CreatedUpdatedDateByUser {

    @Column(columnDefinition = "timestamp with time zone")
    private OffsetDateTime createdDate;
    private UUID createdByUserId;

    @Column(columnDefinition = "timestamp with time zone")
    private OffsetDateTime updatedDate;
    private UUID updatedByUserId;
}
