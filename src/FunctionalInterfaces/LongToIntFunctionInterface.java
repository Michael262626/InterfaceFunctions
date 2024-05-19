package FunctionalInterfaces;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionInterface {
    public static void main(String[] args) {
        LongToIntFunction longToIntFunction = x -> (int) x % 5;
        System.out.println(longToIntFunction.applyAsInt(1234));
    }
}
