package com.example.MovieAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovieByImdb(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
    public Optional<Movie> singleMovieByTitle(String title){
        return movieRepository.findByTitle(title);
    }
    public List<Movie> MoviesByYear(String year){
        return movieRepository.findAllByYear(year);
    }
}
