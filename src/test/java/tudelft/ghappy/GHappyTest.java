package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void gOnTheRight () {
        GHappy gh = new GHappy ();
        boolean result = gh.gHappy("xxgg");
        Assertions.assertTrue(result);
    }
    @Test
    public void noGOnTheRightOrLeft () {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy ("xxxg"));
    }

    @Test
    public void oneGhappyAnotherNot () {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxxggxxxxgyy"));
    }
    }
