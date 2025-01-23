package cattests;

import static org.junit.Assert.assertEquals;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GetFoodTest {

    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setUp() throws Exception{
        cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Мясо", "Мясо", "Мясо"));
    }

    @Test
    public void runGetFoodTest() throws Exception{
        List<String> expected = List.of("Мясо", "Мясо", "Мясо");
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}
