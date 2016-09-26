package ogre.soundsystem;

import org.springframework.context.annotation.Bean;

public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
