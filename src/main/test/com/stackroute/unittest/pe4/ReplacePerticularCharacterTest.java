import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacePerticularCharacterTest {

    ReplacePerticularCharacter replacePerticularCharacter;

    @Before
    public void setUp() throws Exception {
        replacePerticularCharacter=new ReplacePerticularCharacter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replacePerticularCharacterSuccess() {
        assertEquals("faity fry",replacePerticularCharacter.replacePerticularCharacter("daily dry"));
    }

    @Test
    public void replacePerticularCharacterFailure() {
        assertNotEquals("faityy fry",replacePerticularCharacter.replacePerticularCharacter("daily dry"));
    }

}