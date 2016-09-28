package ogre.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("lonelyHeatsClub")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Peppers Lonely Hearts Club Band";

    public SgtPeppers(
            String title,
            String author) {
        this.title = title;
        this.author = author;
    }

    private String author = "The Beatles";

    @Override public void play() {
        System.out.println("Playing: ".concat(author).concat(" - ").concat(title));
    }
}
