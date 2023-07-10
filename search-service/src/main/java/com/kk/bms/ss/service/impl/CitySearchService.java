package com.kk.bms.ss.service.impl;

import com.kk.bms.ss.domain.*;
import com.kk.bms.ss.service.SearchService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CitySearchService implements SearchService {
    @Override
    public List<CitySearchResponse> search(String city) {
        List<CitySearchResponse> citySearchResponses = new ArrayList<>();

        Movie movie = new Movie();
        movie.setMovieName("KGF");

        List<TheatreActiveScreening> activeScreenings = new ArrayList<>();
        TheatreActiveScreening screening = new TheatreActiveScreening();
        screening.setId(1L);

        Map<Movie, List<MovieShowSchedule>> activeMovies = new HashMap<>();
        List<MovieShowSchedule> movieSchedule = new ArrayList<>();
        movieSchedule.add(new MovieShowSchedule(1L, LocalDate.of(2020, 1, 8), "10:00 AM"));
        movieSchedule.add(new MovieShowSchedule(1L, LocalDate.of(2020, 1, 8), "02:00 PM"));
        movieSchedule.add(new MovieShowSchedule(1L, LocalDate.of(2020, 1, 9), "10:00 AM"));
        movieSchedule.add(new MovieShowSchedule(1L, LocalDate.of(2020, 1, 10), "10:00 AM"));
        movieSchedule.add(new MovieShowSchedule(1L, LocalDate.of(2020, 1, 10), "02:00 PM"));
        activeMovies.put(movie, movieSchedule);

        screening.setActiveScreenings(activeMovies);

        Map<Movie, List<String>> map = new HashMap<>();
        map.put(movie, List.of("A1", "A2"));
        screening.setAvailableSeats(map);

        activeScreenings.add(screening);
        CitySearchResponse  c1 = new CitySearchResponse();
        c1.setId(1L);
        c1.setActiveScreenings(activeScreenings);
        citySearchResponses.add(c1);
        return citySearchResponses;
    }
}
