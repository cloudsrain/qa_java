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
public class LionTests {

    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception{
        lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void runGetFoodTest() throws Exception{
        feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals("Ожидался другой набор пищи", expected, actual);
    }

    @Test
    public void runGetKittensTest(){
        int actual = lion.getKittens();
        assertEquals("Ожидалось другое число котят", 1, actual);
    }

    @Test
    public void runLionConstructorExceptionTest() {
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";

        try {
            new Lion("Сумка", feline);
        } catch (Exception e) {
            assertEquals("Ожидалось другое сообщение", expectedMessage, e.getMessage());
        }
    }

}

