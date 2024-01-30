package concurrency.tasks.task_1;

public class Counter {
  private volatile int i;

  public synchronized int getValue() {
    return i;
  }

  public synchronized void increment() {
    i = i + 1;
    System.out.println(Thread.currentThread().getName());
  }

  //not atomic operations
  public synchronized int getI() {
    return i;
  }

  public synchronized void setI(int i) {
    this.i = i;
  }
}
