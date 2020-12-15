package com.example.demo.repository;

import com.example.demo.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getMovieList();
}
