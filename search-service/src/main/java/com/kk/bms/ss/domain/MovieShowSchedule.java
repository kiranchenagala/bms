package com.kk.bms.ss.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieShowSchedule {
    private Long id;
    private LocalDate date;
    private String showTime;
}
