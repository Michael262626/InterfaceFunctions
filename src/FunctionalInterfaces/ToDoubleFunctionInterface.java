package FunctionalInterfaces;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionInterface {
    public static void main(String[] args) {
        ToDoubleFunction<String> toDoubleFunction = String::length;
        System.out.println(toDoubleFunction.applyAsDouble("1"));
    }
}
