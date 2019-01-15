import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchMultipleOcuurenceTest {

    MatchMultipleOcuurence matchMultipleOcuurence;
    String[] st={"Found at: 4-6","Found at: 10-12","Found at: 27-29"};
    @Before
    public void setUp() throws Exception {
        matchMultipleOcuurence=new MatchMultipleOcuurence();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void matchMultipleOcuurenceOfStringSuccess() {
       assertEquals(st,matchMultipleOcuurence.matchMultipleOcuurenceOfString("She sells seashells by the seashore","se"));
    }

    @Test
    public void matchMultipleOcuurenceOfStringFailure() {
        assertNotEquals(st,matchMultipleOcuurence.matchMultipleOcuurenceOfString("sells seashells by the seashore","se"));
    }

}