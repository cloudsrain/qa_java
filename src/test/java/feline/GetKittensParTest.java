package feline;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetKittensParTest {

    private Feline feline;
    private final int kittensCount;
    private final int expected;

    public GetKittensParTest(int kittensCount, int expected){
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittens(){
        return new Object[][]{
                {0, 0},
                {1, 1},
                {3, 3},
                {5, 5},
                {100, 100},
        };
    }

    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void runGetKittensParTest(){
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }

}
