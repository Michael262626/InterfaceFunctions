package FunctionalInterfaces;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionInterface {
    public static void main(String[] args) {
        ToLongBiFunction<Integer, Integer> toLongBiFunction = (a, b) -> a * b;
        System.out.println(toLongBiFunction.applyAsLong(2, 3));
    }
}
