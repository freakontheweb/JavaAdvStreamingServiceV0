package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS,
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(16);

    Rating(int leeftijd) {
        this.minimumAge = leeftijd;
    }
    Rating () {
        this(0);
    }

    private int minimumAge;

    public int getMinimumAge() {
        return minimumAge;
    }
}
