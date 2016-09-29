package ogre.soundsystem;

import org.springframework.stereotype.Component;

@Component("lonelyHeatsClub")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Peppers Lonely Hearts Club Band";
    private String author = "The Beatles";

    public SgtPeppers(
            String title,
            String author) {
        this.title = title;
        this.author = author;
    }

    @Override public void play() {
        System.out.println("Playing: ".concat(author).concat(" - ").concat(title));
    }

    @Override public void playTrack(int i) {

    }
}
