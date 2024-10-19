import java.util.function.Function;

public class SquareCalculator {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        int number = 5;
        int result = square.apply(number);
        System.out.println("Square of " + number + " is: " + result);
    }
}