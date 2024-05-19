package FunctionalInterfaces;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionInterface {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> add = Integer::sum;
        System.out.println(add.applyAsDouble(1, 2));
    }
}
