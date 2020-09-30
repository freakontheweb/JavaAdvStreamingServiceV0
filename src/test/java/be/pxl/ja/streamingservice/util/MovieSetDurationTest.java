package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieSetDurationTest {

    private Movie movie;

    @BeforeEach
    public void init(){
        movie = new Movie("Titanic", Rating.OLDER_KIDS);
    }

    @Test
    public void negativeDurationBecomesPositive() {
        movie.setDuration(-125);

        Assertions.assertEquals(125, movie.getDuration());
    }

    @Test
    public void positiveDurationStaysUnchanged(){
        movie.setDuration(125);

        Assertions.assertEquals(125, movie.getDuration());
    }
}
