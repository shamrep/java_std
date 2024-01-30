package concurrency.tasks.task_1;

import static java.lang.Thread.sleep;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        c.setI(c.getI() + 1);
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        c.setI(c.getI() + 1);
      }
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(c.getI());

  }

  public static void test() throws InterruptedException {
    Counter counter = new Counter();
    for (int i = 0; i < 10; i++) {
      new Thread(() -> {
        for (int j = 0; j < 100; j++) {
          //            sleep(1);
          counter.increment();
        }
      }).start();
    }

    sleep(3000);

    for (int i = 0; i < 5; i++) {
      new Thread(() -> System.out.println(counter.getValue())).start();
    }
  }
}
