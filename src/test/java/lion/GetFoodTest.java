package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GetFoodTest {

    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception{
        lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо", "Мясо", "Мясо"));
    }

    @Test
    public void runGetFoodTest() throws Exception{
        List<String> expected = List.of("Мясо","Мясо","Мясо");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

}
