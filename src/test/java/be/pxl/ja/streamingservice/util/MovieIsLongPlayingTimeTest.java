package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MovieIsLongPlayingTimeTest {

    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.OLDER_KIDS);
    }

    @Test
    public void returnsFalseIfDurationLessThanLongPlayingTime() {
        //Arrange
        movie.setDuration(Movie.LONG_PLAYING_TIME - 1);
        //Act
        boolean result = movie.isLongPlayingTime();
        //Assert
        assertFalse(result);
    }

    @Test
    public void returnsTrueIfDurationMoreThanLongPlayingTime() {
        movie.setDuration(Movie.LONG_PLAYING_TIME + 1);

        Assertions.assertTrue(movie.isLongPlayingTime());
    }

    @Test
    public void returnsTrueIfDurationExactlyLongPlayingTime() {
        movie.setDuration(Movie.LONG_PLAYING_TIME);

        Assertions.assertTrue(movie.isLongPlayingTime());
    }

}
