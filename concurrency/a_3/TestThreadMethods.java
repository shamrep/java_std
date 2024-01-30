package concurrency.a_3;

import static java.lang.Thread.sleep;

public class TestThreadMethods {
  static int c = 0;
  public static void main(String[] args) throws InterruptedException {
      Runnable r = () -> {
        for (int i = 0; i < 100; i++) {
          System.out.println(i);
          c++;
          try {
            sleep(10);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      };

      Thread t = new Thread(r);
      t.start();
      t.join();

    System.out.println("total sum = " + c);


  }
}
