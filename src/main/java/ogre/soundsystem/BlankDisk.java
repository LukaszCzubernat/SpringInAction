package ogre.soundsystem;

import java.util.List;

public class BlankDisk implements CompactDisc {
    String title;
    String author;
    List<String> tracks;

    public BlankDisk(String title, String author, List<String> tracks) {
        this.title = title;
        this.author = author;
        this.tracks = tracks;
    }

    @Override public void play() {
        System.out.println("Playing: ".concat(author).concat(" - ").concat(title));
    }
}
