package com.example.MovieAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(),HttpStatus.OK);
    }
    @GetMapping("/imdb/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovieByImdbId(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovieByImdb(imdbId),HttpStatus.OK);
    }
    @GetMapping("/title/{title}")
    public ResponseEntity<Optional<Movie>> getSingleMovieByTitle(@PathVariable String title){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovieByTitle(title),HttpStatus.OK);
    }
    @GetMapping("/year/{year}")
    public ResponseEntity<List<Movie>> getMoviesByYear(@PathVariable String year){
        return new ResponseEntity<List<Movie>>(movieService.MoviesByYear(year),HttpStatus.OK);
    }

}
