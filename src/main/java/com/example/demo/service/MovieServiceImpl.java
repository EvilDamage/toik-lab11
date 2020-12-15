package com.example.demo.service;

import com.example.demo.dto.MovieDto;
import com.example.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieServiceImpl implements MovieService{
    final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Map<String, List<MovieDto>> getMovieList() {
        List<MovieDto> movieDtoList = movieRepository.getMovieList();
        Map<String, List<MovieDto>> mapMovies = new HashMap<>();
        mapMovies.put("movies", movieDtoList);

        return mapMovies;
    }
}
