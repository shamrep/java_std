package lambda_and_streams.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
  public static void main(String[] args) {
    Supplier<String> supplier = () -> "Supplier.";

    Supplier<String> supplier1 = new Supplier<String>() {
      @Override
      public String get() {
        return null;
      }
    };

    final int a = 0;
    Consumer <String> consumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(a);
      }
    };


    Predicate<String> predicate = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return false;
      }
    };

    Function<String, Integer> function = new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        return null;
      }
    };


  }
}
