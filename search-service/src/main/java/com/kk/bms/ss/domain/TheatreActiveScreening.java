package com.kk.bms.ss.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class TheatreActiveScreening {
    private Long id;
    private Theatre theatreDetails;
    private Map<Movie, List<MovieShowSchedule>> activeScreenings;
    private Map<Movie, List<String>> availableSeats;
}
