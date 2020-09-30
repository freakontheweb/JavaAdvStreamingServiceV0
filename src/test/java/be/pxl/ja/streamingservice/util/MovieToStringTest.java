package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MovieToStringTest {

    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.TEENS);
    }

    @Test
    public void printTheTitleAndReleaseDataIfNotNull () {
        movie.setReleaseDate(LocalDate.now());

        Assertions.assertEquals("Titanic " + LocalDate.now().getYear(), movie.toString());
    }

    @Test
    public void printTheTitleAndNotReleaseDataIfNull () {

        Assertions.assertEquals("Titanic", movie.toString());
    }
}
