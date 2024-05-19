package FunctionalInterfaces;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionInterface {
    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> add = Integer::sum;
        System.out.println(add.applyAsInt(1, 2));
    }
}
