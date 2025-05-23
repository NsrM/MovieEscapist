package com.movieescapist.searchservice.service;

import com.movieescapist.searchservice.model.Movie;

import java.util.List;

public interface SearchMovieList {

    List<Movie> searchMovies(String searchTerm);
}
