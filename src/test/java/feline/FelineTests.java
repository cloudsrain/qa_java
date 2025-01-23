package feline;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {

    private Feline feline;

    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void runGetKittensTest(){
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Ожидалось другое число котят", expected, actual);
    }

    @Test
    public void runGetFamilyTest(){
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Ожидалось другое семейство", expected, actual);
    }

    @Test
    public void runEatMeatTest() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Ожидался другой набор пищи", expected, actual);
    }

}