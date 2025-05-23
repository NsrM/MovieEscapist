package com.movieescapist.searchservice.controller;

import com.movieescapist.searchservice.model.Movie;
import com.movieescapist.searchservice.repository.MoviesRepository;
import com.movieescapist.searchservice.response.MoviesListResponseDto;
import com.movieescapist.searchservice.service.SearchMovieList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {

//    @Autowired
//    SearchMovieList searchMovieList;

    @Autowired
    MoviesRepository moviesRepository;

    @GetMapping
    ResponseEntity<MoviesListResponseDto> findMovies(@RequestParam String searchTerm){
        // For Now Assuming search term
        // chiru hits
        List<Movie> movies = moviesRepository.findAll();
        for(int i=0;i<movies.size();i++){
            System.out.println(movies.get(i).getMovieName());
        }

        MoviesListResponseDto moviesListResponseDto = new MoviesListResponseDto();
        moviesListResponseDto.setMoviesList(movies);

        return ResponseEntity.ok(moviesListResponseDto);
    }
}
