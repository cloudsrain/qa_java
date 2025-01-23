package liontests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionConstructorExceptionTest {

    @Mock
    private Feline feline;

    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void runLionConstructorExceptionTest() {
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";

        try {
            new Lion("Сумка", feline);
        } catch (Exception e) {
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}
