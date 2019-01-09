import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    Transpose tr;

    @Before
    public void setUp() throws Exception {
        tr=new Transpose();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void transposeSuccess() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",tr.transpose("a quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void transposeFailure() {
        assertNotEquals("a kciuq nworb xof spmuj revo eht yzal godd",tr.transpose("a quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void checkEmpty() {
        assertEquals("Input should be not be empty or null",tr.transpose(""));
    }

    @Test
    public void checkNull()
    {
        assertEquals("Input should be not be empty or null",tr.transpose(null));
    }

}