package lambda_and_streams.variable_capturing;

import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

public class VariableCapturing {
  public static void main(String[] args) {
    int x[] = {1};
    Consumer<Integer> consumer = n -> {
      n += x[0] += n;
      System.out.println(n);
    };

    consumer.accept(3);
    System.out.println(x[0]);
//    Consumer<Integer> consumer = n -> x += x[0];
//    Consumer<Integer> consumer = n -> x += n;
//    x= x + x;
  }
}
