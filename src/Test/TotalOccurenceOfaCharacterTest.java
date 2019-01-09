import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalOccurenceOfaCharacterTest {

    TotalOccurenceOfaCharacter total;

    @Before
    public void setUp() throws Exception {
        total=new TotalOccurenceOfaCharacter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void totalOccurenceOfCharacterSuccess() {
        assertEquals(10,total.totalOccurenceOfCharacter("Java is java again java again"));
    }

    @Test
    public void totalOccurenceOfCharacterFailure() {
        assertNotEquals(11,total.totalOccurenceOfCharacter("Java is java again java again"));
    }
}