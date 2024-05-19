package FunctionalInterfaces;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorInterface {
    public static void main(String[] args) {
        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
        System.out.println(longBinaryOperator.applyAsLong(1L, 2L));
    }
}
