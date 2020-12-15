package com.example.demo.rest;

import com.example.demo.dto.MovieDto;
import com.example.demo.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class MoviesApiController {
    final MovieService movieService;

    public MoviesApiController(MovieService movieService) {
        this.movieService = movieService;
    }

    @CrossOrigin
    @GetMapping("/movies")
    public ResponseEntity<Map<String, List<MovieDto>>> getAllNotes(){
        return new ResponseEntity<>(movieService.getMovieList(), HttpStatus.OK);
    }
}


