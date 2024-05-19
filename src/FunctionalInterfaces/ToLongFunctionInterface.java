package FunctionalInterfaces;

import java.util.function.ToLongFunction;

public class ToLongFunctionInterface {
    public static void main(String[] args) {
        ToLongFunction<String> toLongFunction = String::length;
        System.out.println(toLongFunction.applyAsLong("Hello"));
    }
}
