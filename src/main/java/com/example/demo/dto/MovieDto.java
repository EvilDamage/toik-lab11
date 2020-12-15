package com.example.demo.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
public class MovieDto implements Serializable {
    private int movieId;
    private String title;
    private int year;
    private String image;

    private MovieDto(Builder builder){
        this.movieId = builder.movieId;
        this.title = builder.title;
        this.year = builder.year;
        this.image = builder.image;
    }

    public static class Builder{
        private int movieId;
        private String title;
        private int year;
        private String image;

        public Builder movieId(int movieId) {this.movieId = movieId; return this; }
        public Builder title(String title) {this.title = title; return this; }
        public Builder year(int year) {this.year = year; return this; }
        public Builder image(String image) {this.image = image; return this; }

        public MovieDto build() {return new MovieDto(this); }
    }
}
