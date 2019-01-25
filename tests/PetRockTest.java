import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock rocky = new PetRock("rocky");

    @Test
    public void getName() {
        String name = rocky.getName();
        assertEquals("rocky", name);
    }

    @Test
    public void testUnhappyToStart() {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }
}