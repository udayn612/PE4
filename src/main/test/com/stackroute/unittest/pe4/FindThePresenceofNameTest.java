import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindThePresenceofNameTest {
    FindThePresenceofName findThePresenceofName;

    @Before
    public void setUp() throws Exception {
        findThePresenceofName=new FindThePresenceofName();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findtheNameInaStringSuccess() {
        assertEquals(true,findThePresenceofName.findtheNameInaString("This is Harry.","Harry"));
    }

    @Test
    public void findtheNameInaStringFailure() {
        assertNotEquals(false,findThePresenceofName.findtheNameInaString("This is Harry.","Harry"));
    }
}