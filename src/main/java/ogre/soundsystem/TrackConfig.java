package ogre.soundsystem;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;

@Configuration
@EnableAspectJAutoProxy
public class TrackConfig {
    
    @Bean
    public CompactDisc fearOfTheDark(){
        BlankDisc disc = new BlankDisc("Fear of the dark", "Iron Maden", new ArrayList<>());
        disc.tracks.add("Fear of the dark");
        disc.tracks.add("Fear is the key");
        disc.tracks.add("Childhood's end");
        disc.tracks.add("Afraid to shoot strangers");
        disc.tracks.add("Be quick or be dead");
        return disc;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
