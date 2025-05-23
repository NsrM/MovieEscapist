package com.movieescapist.searchservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "movieCast")
public class MovieCast {
    @Id
    @GeneratedValue
    Long id;
    String movieName;

    String actorName;

    Long actorId;
}
