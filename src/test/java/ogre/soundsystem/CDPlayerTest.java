package ogre.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mediaPlayer.xml")
public class CDPlayerTest { //for testNG add extends AbstractTestNGSpringContextTests

    private static final String expectedPlayerOutput = "Playing: The Beatles - Sgt. Peppers Lonely Hearts Club Band\n\n";

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    ApplicationContext context;

    @Autowired
    CompactDisc compactDisc;

    @Autowired
    MediaPlayer player;

    @Test
    public void contextShouldNotBeNull() {
        assertNotNull("We're fucked, context is NULL!", context);
    }

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull("We're fucked, compact disc is NULL!", compactDisc);
    }

    @Test
    public void play() {
        player.play();
        assertEquals(expectedPlayerOutput, log.getLog());
    }
}
