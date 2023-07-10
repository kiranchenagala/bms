package com.kk.bms.ss.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Movie {
    private Long id;
    private String movieName;
    private String movieDescription;
    private String starCast;
    private List<String> genres;
    private List<String> comments;
    private Map<String, Double> ratings;
}
