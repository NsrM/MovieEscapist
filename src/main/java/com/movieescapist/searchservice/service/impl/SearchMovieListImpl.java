package com.movieescapist.searchservice.service.impl;

import com.movieescapist.searchservice.model.Movie;
import com.movieescapist.searchservice.model.MovieCast;
import com.movieescapist.searchservice.repository.MoviesCastRepository;
import com.movieescapist.searchservice.repository.MoviesRepository;
import com.movieescapist.searchservice.response.MoviesListResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchMovieListImpl {

    @Autowired
    MoviesCastRepository movieCastRepository;

    @Autowired
    MoviesRepository moviesRepository;

    MoviesListResponseDto findMovies(String searchTerm) {
        // For now returning all chiranjeevi movies as hits
//        if(searchTerm.contains("chiru") || searchTerm.contains("chiranjeevi") )
//            searchTerm = "Chiranjeevi";
//        List<MovieCast> moviesCastList  = movieCastRepository.findByActorName(searchTerm);
//        List<String> movieList = moviesCastList.stream().map(MovieCast::getMovieName).collect(Collectors.toList());
//        List<Movie> moviesList = moviesRepository.findAllByMovieName(movieList);
        MoviesListResponseDto moviesResponseDto = new MoviesListResponseDto();
//        moviesResponseDto.setMoviesList(moviesList);
        return moviesResponseDto;
    }
}
