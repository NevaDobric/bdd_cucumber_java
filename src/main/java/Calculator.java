import java.util.Deque;
import java.util.LinkedList;

public class Calculator {

    private final Deque<Number> stack = new LinkedList<>();



    public int additionResult(int num1, int num2) {
        return num1 + num2;
    }

    public void push(Object a) {
    }
}
