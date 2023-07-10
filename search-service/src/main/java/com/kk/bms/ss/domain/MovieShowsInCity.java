package com.kk.bms.ss.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MovieShowsInCity {
    private Long id;
    private List<String> moviesCurrentlyPlaying;
    private List<String> avilableShowTimings;
    private List<String> availableSeats;
    private String pincode;
}
