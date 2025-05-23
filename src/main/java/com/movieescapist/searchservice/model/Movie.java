package com.movieescapist.searchservice.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Table(name="movies")
@Entity
public class Movie {

    @Id
    @GeneratedValue
    Long id;

    @Getter
    @Column(name="movieName")
    String movieName;


//
//    List<String> movieCast;
//
//    List<String> movieCrew;
//
//    List<String> protagonistList;
//
//    List<String> antagonistList;

    @Column(name="releaseDate")
    @Getter
    Date releaseDate;

    @Column(name="language")
    @Getter
    String language;


}
