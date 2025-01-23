package cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setUp() throws Exception{
        cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void runGetFoodTest() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        assertEquals("Ожидался другой набор пищи", expected, actual);
    }

    @Test
    public void runGetSoundTest(){
        String actual = cat.getSound();
        assertEquals("Ожидался другой звук","Мяу", actual);
    }
}
