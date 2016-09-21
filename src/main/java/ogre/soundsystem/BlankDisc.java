package ogre.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;
    private String author;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override public void play() {
        System.out.println("Playing: ".concat(author).concat(" - ").concat(title));
        tracks.forEach(System.out::println);
    }
}
