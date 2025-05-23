package com.movieescapist.searchservice.repository;

import com.movieescapist.searchservice.model.MovieCast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoviesCastRepository extends JpaRepository<MovieCast, Long> {

    List<MovieCast> findByActorName(String actorName);


}
