package FunctionalInterfaces;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorInterface {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = x -> x * 2;
        System.out.println(longUnaryOperator.applyAsLong(5));
    }
}
