package cattests;

import static org.junit.Assert.assertEquals;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetSoundTest {

    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setUp(){
        cat = new Cat(feline);
    }

    @Test
    public void runGetSoundTest(){
        String actual = cat.getSound();
        assertEquals("Мяу", actual);
    }
}
