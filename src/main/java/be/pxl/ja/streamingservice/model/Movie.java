package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            duration *= -1;
        }
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getPlayingTime() {
        String result;

        if (getDuration() == 0) {
            result = "?";
        } else if (getDuration() < 60) {
            result = getDuration() + " min";
        } else if (getDuration() % 60 == 0) {
            result = (getDuration() / 60) + " h";
        } else {
            result = (getDuration() / 60) + " h " + (getDuration() % 60) + " min";
        }
        return result;
    }

    @Override
    public String toString() {
        String description = getTitle();

        if (getReleaseDate() != null) {
            description = getTitle() + " " + getReleaseDate().getYear();
        }
        return description;
    }
}