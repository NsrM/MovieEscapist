package com.movieescapist.searchservice.response;

import com.movieescapist.searchservice.model.Movie;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MoviesListResponseDto {
    List<Movie> moviesList;
}
