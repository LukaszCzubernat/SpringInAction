package ogre.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override public void play() {
        compactDisc.play();
    }
}
