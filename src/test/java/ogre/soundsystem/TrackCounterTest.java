package ogre.soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackConfig.class)
public class TrackCounterTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    CompactDisc compactDisc;

    @Autowired
    TrackCounter trackCounter;

    @Test
    public void countTest(){
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(0);
        compactDisc.playTrack(3);
        compactDisc.playTrack(1);
        compactDisc.playTrack(0);
        compactDisc.playTrack(4);
        compactDisc.playTrack(0);

        assertEquals(trackCounter.getTracksPlayed(0), 3);
        assertEquals(trackCounter.getTracksPlayed(1), 2);
        assertEquals(trackCounter.getTracksPlayed(2), 1);
        assertEquals(trackCounter.getTracksPlayed(3), 1);
        assertEquals(trackCounter.getTracksPlayed(4), 1);
    }


}
