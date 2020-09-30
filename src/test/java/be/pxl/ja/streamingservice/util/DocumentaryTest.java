package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Documentary;
import be.pxl.ja.streamingservice.model.Genre;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DocumentaryTest {

    @Test
    public void testDocumentaryContstructor(){
        Documentary documentary = new Documentary("Planet Earth", Rating.OLDER_KIDS);

        Assertions.assertEquals("Planet Earth", documentary.getTitle());
        Assertions.assertEquals(Rating.OLDER_KIDS, documentary.getMaturityRating());
        Assertions.assertEquals(Genre.DOCUMENTARY, documentary.getGenre());
    }
}
