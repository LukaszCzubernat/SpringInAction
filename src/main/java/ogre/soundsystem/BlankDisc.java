package ogre.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
    String title;
    String author;
    List<String> tracks;

    public BlankDisc(String title, String author, List<String> tracks) {
        this.title = title;
        this.author = author;
        this.tracks = tracks;
    }

    @Override public void play() {
        System.out.println("Playing: ".concat(author).concat(" - ").concat(title));
    }

    @Override
    public void playTrack(int i){
        System.out.println("Playing: ".concat(author).concat(" - ").concat(tracks.get(i)));
    }
}