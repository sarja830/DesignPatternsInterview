package Playlist;

public class Song implements IComponent{
    private String name;
    private String artist;
    private float speed;
    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.speed = 1.0f;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void play() {
        System.out.println("Playing " + name + " by " + artist);
    }
    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
        System.out.println("Playback speed is set to " + speed);
    }
}
