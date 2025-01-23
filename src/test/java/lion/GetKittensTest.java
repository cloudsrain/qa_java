package liontests;

import static org.junit.Assert.assertEquals;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetKittensTest {

    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception{
        lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(5);
    }


    @Test
    public void runGetKittensTest(){
        int actual = lion.getKittens();
        assertEquals(5, actual);
    }
}
