package feline;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetFamilyTest {

    private Feline feline;

    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void runGetFamilyTest(){
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
}
