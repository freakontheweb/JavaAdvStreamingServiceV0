package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Content;
import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Profile;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProfileAllowedToWatchTest {

    private Profile profile;
    private Content content;

    @BeforeEach
    public void init() {
        profile = new Profile("Alpiray", LocalDate.of(1999, 6, 8));
        content = new Movie("Titanic", Rating.MATURE);
    }

    @Test
    public void returnFalseIfDateOfBirthIsNull() {
        profile.setDateOfBirth(null);
        Assertions.assertFalse(profile.allowedToWatch(content));
    }

    @Test
    public void returnTrueIfContentIsAllowedToWatch(){
        Assertions.assertTrue(profile.allowedToWatch(content));
    }

    @Test
    public void returnFalseIfContentIsNotAllowedToWatch(){
        profile.setDateOfBirth(LocalDate.of(2005, 6, 8));
        Assertions.assertFalse(profile.allowedToWatch(content));
    }
}
