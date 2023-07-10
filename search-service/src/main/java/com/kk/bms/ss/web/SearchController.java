package com.kk.bms.ss.web;

import com.kk.bms.ss.domain.CitySearchResponse;
import com.kk.bms.ss.domain.MovieSearchResponse;
import com.kk.bms.ss.ocnstants.ApiConstants;
import com.kk.bms.ss.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/"+ ApiConstants.API_VERSION +"/search")
public class SearchController {

    @Autowired
    private SearchService movieSearchService;

    @Autowired
    private SearchService citySearchService;

    @GetMapping("/search/movie-name")
    public List<MovieSearchResponse> searchByMovieName(@RequestParam String movieName){
        return (List<MovieSearchResponse>)movieSearchService.search(movieName);
    }

    @GetMapping("/search/city")
    public List<CitySearchResponse> searchByCity(@RequestParam String city){
        return (List<CitySearchResponse>)citySearchService.search(city);
    }
}
