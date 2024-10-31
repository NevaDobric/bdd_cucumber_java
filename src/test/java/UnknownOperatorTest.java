import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnknownOperatorTest {
    @Test
    public void unknown_operator_results_in_addition(){
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("?");
        Number actualAnswer = calc.value();

        assertEquals(expectedAnswer,actualAnswer);    }
}
