package lambda_and_streams.lambda;

import java.util.ArrayList;
import java.util.List;
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
    Consumer<String> consumer = new Consumer<String>() {
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

//    List<Integer> ints = new ArrayList<>();
//    int number = 1;
//
////    Integer t = ints.get(number);
//    Consumer<List<Integer>> consumer5 = o -> {
//      Integer t = ints.get(number);
//      t++;
//    };

    List<Integer> ints = new ArrayList<>();

    Consumer<List<Integer>> consumer3 = o -> o.add(12312);
    consumer3.accept(ints);

    class MyConsumer implements Consumer<List<Integer>> {

      @Override
      public void accept(List<Integer> list) {
       list.add(12);
      }
    }

    Consumer<List<Integer>> consumer4 = new MyConsumer();

    consumer4.accept(ints);




  }


}
