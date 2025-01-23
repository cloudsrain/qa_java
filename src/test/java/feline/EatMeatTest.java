package feline;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EatMeatTest {

    private Feline feline;

    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void runEatMeatTest() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

}
