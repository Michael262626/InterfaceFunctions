package FunctionalInterfaces;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionInterface {
    public static void main(String[] args) {
        LongToDoubleFunction longToDoubleFunction = x -> x;
        System.out.println(longToDoubleFunction.applyAsDouble(10));
    }
}
