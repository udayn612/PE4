import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacePerticularCharacterTest {

    ReplacePerticularCharacter replace;

    @Before
    public void setUp() throws Exception {
        replace=new ReplacePerticularCharacter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replacePerticularCharacterSuccess() {
        assertEquals("faity fry",replace.replacePerticularCharacter("daily dry"));
    }

    @Test
    public void replacePerticularCharacterFailure() {
        assertNotEquals("faityy fry",replace.replacePerticularCharacter("daily dry"));
    }

}