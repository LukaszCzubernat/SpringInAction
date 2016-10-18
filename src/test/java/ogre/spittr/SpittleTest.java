package ogre.spittr;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class SpittleTest {

    @Test
    public void equalityTest() {
        Date date = new Date();
        Spittle firstSpittle = new Spittle("Wololo", date);
        Spittle secondSpittle = new Spittle("Wololo", date);
        Spittle thirdSpittle = new Spittle("Wololo", date);

        assertEquals(firstSpittle, secondSpittle);
        assertEquals(secondSpittle, firstSpittle);
        assertEquals(secondSpittle, thirdSpittle);
        assertEquals(firstSpittle, thirdSpittle);
    }
}
