package io.javabrains.movieinfoservice.resources;

import io.javabrains.movieinfoservice.models.Movie;
import jdk.incubator.vector.VectorOperators;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/movie")

public class MovieResource {
    @RequestMapping("/{movie}")
    public Movie getMovieInfo(@PathVariable("movieId")String movieId){
        return new Movie(movieId, "Test name");


    }

}
