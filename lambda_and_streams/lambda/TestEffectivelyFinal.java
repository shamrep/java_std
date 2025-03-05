package lambda_and_streams.lambda;

import java.util.function.IntFunction;
import java.util.function.Supplier;

public class TestEffectivelyFinal {
    public static void main(String[] args) {
        int i = 0;

        IntFunction<Integer> sum = value -> i + 100 + value;
        System.out.println(sum.apply(100));

    }
}
