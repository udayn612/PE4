import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalOccurenceOfaCharacterTest {

    TotalOccurenceOfaCharacter totalOccurenceOfaCharacter;

    @Before
    public void setUp() throws Exception {
        totalOccurenceOfaCharacter=new TotalOccurenceOfaCharacter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void totalOccurenceOfCharacterSuccess() {
        assertEquals(10,totalOccurenceOfaCharacter.totalOccurenceOfCharacter("Java is java again java again"));
    }

    @Test
    public void totalOccurenceOfCharacterFailure() {
        assertNotEquals(11,totalOccurenceOfaCharacter.totalOccurenceOfCharacter("Java is java again java again"));
    }
}