package com.movieescapist.searchservice.repository;

import com.movieescapist.searchservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoviesRepository extends JpaRepository<Movie, Long> {

    //List<Movie> findAllByMovieName(List<String> movieList);

    List<Movie> findAll();
}
