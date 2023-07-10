package com.kk.bms.ss.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MovieSearchResponse {
    private Long id;
    private List<TheatreActiveScreening> activeScreenings;
    private Movie movieDetails;
}
