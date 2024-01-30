package lambda_and_streams.method_reference;

import java.util.function.Consumer;

public class Test {
  private String string = "Test";
  static void myMethod(String s) {
    System.out.println("My method. " + s);
  }

  class MyConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
//      System.out.println("My method. " + s);
      myMethod(s);
    }
  }

  public static void main(String[] args) {
    Consumer<String> consumer = Test::myMethod;
    consumer.accept("1_1");

    MyConsumer myConsumer = new Test().new MyConsumer();

    new Test().print(myConsumer);
    new Test().print(consumer);

  }

  public void print(Consumer<String> consumer) {
    System.out.println("print");
    consumer.accept(string);
  }
}
