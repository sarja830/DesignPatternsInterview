package Playlist;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements IComponent{
    private String playListName;
    List<IComponent> songs;
    public PlayList(String playListName) {
         this.playListName = playListName;
         songs = new ArrayList<>();
    }
    @Override
    public String getName() {
        return playListName;
    }
    @Override
    public void play() {
        System.out.println("Playing playlist " + playListName);
        for(IComponent song : songs) {
            song.play();
        }
    }
    @Override
    public void setPlaybackSpeed(float speed) {
        System.out.println("Playback speed is set to " + speed);
    }
    public void add(IComponent component) {
        songs.add(component);
        System.out.println("Adding " + component.getName() + " to playlist " + playListName);
    }
    public void remove(IComponent component) {
        songs.remove(component);
        System.out.println("Removing " + component.getName() + " from playlist " + playListName);
    }
    public List<IComponent> getSongs(int index) {
        System.out.println("Getting component at index " + index);
        return songs;
    }
}
