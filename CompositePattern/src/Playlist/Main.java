package Playlist;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("tere pyar me", "kumar sanu");
        Song song1 = new Song("tujhme Uljha jiya", "kumar sanu");
        Song song2 = new Song("tumse milne ko dil karta hai", "kumar sanu");
        Song song3 = new Song("tum mile", "kumar sanu");
        Song song4 = new Song("meri ashiqui", "Arijit singh");
        Song song5 = new Song("tum hi ho", "Arijit singh");
        song1.play();
        PlayList playlist = new PlayList("Kumar sanu and Arijit singh");
        PlayList playlistKumar = new PlayList("Kumar Sanu");
        PlayList playlistArijit = new PlayList("Arijit Singh");
        playlistKumar.add(song);
        playlistKumar.add(song1);
        playlistKumar.add(song2);
        playlistKumar.add(song3);
        playlistArijit.add(song4);
        playlistArijit.add(song5);
        playlistKumar.play();
        playlist.add(playlistKumar);
        playlist.add(playlistArijit);
        playlist.play();
    }
}
