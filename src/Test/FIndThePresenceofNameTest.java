import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FIndThePresenceofNameTest {
    FindThePresenceofName fp;

    @Before
    public void setUp() throws Exception {
        fp=new FindThePresenceofName();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findtheNameInaStringSuccess() {
        assertEquals(true,fp.findtheNameInaString("This is Harry.","Harry"));
    }

    @Test
    public void findtheNameInaStringFailure() {
        assertNotEquals(false,fp.findtheNameInaString("This is Harry.","Harry"));
    }
}