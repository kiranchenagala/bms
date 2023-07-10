package com.kk.bms.ss.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CitySearchResponse {
    private Long id;
    private List<TheatreActiveScreening> activeScreenings;
}
