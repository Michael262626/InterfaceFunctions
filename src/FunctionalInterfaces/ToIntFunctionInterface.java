package FunctionalInterfaces;

import java.util.function.ToIntFunction;

public class ToIntFunctionInterface {
    public static void main(String[] args) {
        ToIntFunction<String> toIntFunction = String::length;
        System.out.println(toIntFunction.applyAsInt("michael"));
    }
}
