package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieGetPlayingTimeTest {

    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.OLDER_KIDS);
    }

    @Test
    public void returnsQuestionmarkWhenDurationZero() {
        movie.setDuration(0);
        Assertions.assertEquals("?", movie.getPlayingTime());
    }

    @Test
    public void returnsMinutesWhenDurationLessThan60() {
        movie.setDuration(59);
        Assertions.assertEquals("59 min", movie.getPlayingTime());
    }

    @Test
    public void returnsHoursWhenDurationMultipleOf60() {
        movie.setDuration(120);
        Assertions.assertEquals("2 h", movie.getPlayingTime());
    }

    @Test
    public void returnsHoursAndMinutesWhenDurationNotMultipleOf60() {
        movie.setDuration(135);
        Assertions.assertEquals("2 h 15 min", movie.getPlayingTime());
    }
}
