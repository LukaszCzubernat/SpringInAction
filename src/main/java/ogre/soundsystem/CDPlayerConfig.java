package ogre.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean(name = "lonelyHeatsClub")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
