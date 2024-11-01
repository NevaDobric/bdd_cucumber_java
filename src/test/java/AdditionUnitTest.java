import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionUnitTest {
    @Test
    public void add_int_1_and_int_2_returns_3(){
        int a = 1;
        int b = 2;
        Number expectedAnswer = 3.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();

        assertEquals(expectedAnswer,actualAnswer);    }

}
