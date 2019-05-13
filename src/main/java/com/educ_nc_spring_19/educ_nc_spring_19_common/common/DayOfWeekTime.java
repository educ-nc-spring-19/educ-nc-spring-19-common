package com.educ_nc_spring_19.educ_nc_spring_19_common.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.DayOfWeek;
import java.time.OffsetTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
public class DayOfWeekTime {
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DayOfWeek day;

    @Column(name = "day_time", columnDefinition = "time with time zone", nullable = false)
    private OffsetTime time;
}
