package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {

    private String topic;

    public Documentary(String title, Rating maturityRating) {
        super(title, maturityRating);
        setGenre(Genre.DOCUMENTARY);
    }

    @Override
    public void pause() {
        System.out.println("Pausing documentary: " + this);
    }

    @Override
    public void play() {
        StringBuilder playString = new StringBuilder();
        playString.append("Playing documentary: ").append(this);
        if (topic != null) {
            playString.append("\nTopic: " + getTopic());
        }
        System.out.println(playString);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
