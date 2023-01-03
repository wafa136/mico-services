package io.javabrains.ratingsdataservice.models;

public class Rating {
    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    private String movieId;
    private int rating;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
