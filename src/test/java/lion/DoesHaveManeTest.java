package liontests;

import static org.junit.Assert.assertEquals;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class DoesHaveManeTest {

    @Mock
    private Feline feline;
    private Lion lion;
    private final String sex;
    private final boolean expected;

    public DoesHaveManeTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getLionsGender() {
        return new Object[][]{
                //Пол животного
                //Самец
                {"Самец", true},
                //Самка
                {"Самка", false},
        };
    }

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
        lion = new Lion(sex, feline);
    }


    @Test
    public void runDoesHaveManeTest() {
        boolean actual = lion.doesHaveMane();
        assertEquals("Что-то пошло не так!", expected, actual);

    }
}
