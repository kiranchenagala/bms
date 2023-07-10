package com.kk.bms.ss.service.impl;

import com.kk.bms.ss.domain.Movie;
import com.kk.bms.ss.domain.MovieShowSchedule;
import com.kk.bms.ss.domain.MovieSearchResponse;
import com.kk.bms.ss.domain.TheatreActiveScreening;
import com.kk.bms.ss.service.SearchService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieSearchService implements SearchService {

    @Override
    public List<MovieSearchResponse> search(String movieName) {
        List<MovieSearchResponse> movieShowsByMovieName = new ArrayList<>();
        MovieSearchResponse movieShowsByMovieName1 = new MovieSearchResponse();
        movieShowsByMovieName1.setId(1L);
        Movie movie = new Movie();
        movie.setMovieName("KGF");
        movieShowsByMovieName1.setMovieDetails(movie);

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
        movieShowsByMovieName1.setActiveScreenings(activeScreenings);
        movieShowsByMovieName.add(movieShowsByMovieName1);
        return movieShowsByMovieName;
    }
}
