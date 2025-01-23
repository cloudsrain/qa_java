package felinetest;

import static org.junit.Assert.assertEquals;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

public class GetKittensTest {

    private Feline feline;
    int expected = 1;

    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void runGetKittensTest(){
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

}
