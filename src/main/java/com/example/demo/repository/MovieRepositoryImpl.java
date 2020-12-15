package com.example.demo.repository;

import com.example.demo.dto.MovieDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository{
    private final List<MovieDto> movieList;

    public MovieRepositoryImpl() {
        movieList = new ArrayList<>();
        movieList.add(new MovieDto.Builder().movieId(1).title("Piraci z krzemowej doliny").image("https://fwcdn.pl/fpo/30/02/33002/6988507.6.jpg").year(1999).build());
        movieList.add(new MovieDto.Builder().movieId(2).title("Ja, robot").image("https://fwcdn.pl/fpo/54/92/95492/7521206.6.jpg").year(2004).build());
        movieList.add(new MovieDto.Builder().movieId(3).title("Kod nieśmiertelności").image("https://fwcdn.pl/fpo/89/67/418967/7370853.6.jpg").year(2011).build());
        movieList.add(new MovieDto.Builder().movieId(4).title("Ex Machina").image("https://fwcdn.pl/fpo/64/19/686419/7688121.6.jpg").year(2015).build());
    }

    public List<MovieDto> getMovieList() {
        return movieList;
    }
}
