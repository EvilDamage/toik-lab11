package com.example.demo.service;

import com.example.demo.dto.MovieDto;
import java.util.List;
import java.util.Map;

public interface MovieService {
    Map<String, List<MovieDto>> getMovieList();
}
