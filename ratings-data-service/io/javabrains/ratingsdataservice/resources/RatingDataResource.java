package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class RatingDataResource {

    @RestController
    @RequestMapping("/ ratingsdata ")

    public class MovieResource {
        @RequestMapping("/{movieId}")
        public Rating getRating(@PathVariable("movieId")String movieId){
            return new Rating(movieId, 4);


        }

    }
}
