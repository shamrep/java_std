package concurrency.a_4_thread_signaling;

public class Example extends Thread {
  private Object obj;

  public Example(Object obj) {
    this.obj = obj;
  }

  public void methodWait() {
    synchronized (this) {
      System.out.println("Before wait, method of " + Thread.currentThread());
      try {
        wait();
        System.out.println("After wait, method of " + Thread.currentThread());
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public void methodNotify() {
    synchronized (this) {
      System.out.println("Before notify, method of " + Thread.currentThread());

       notify();
        System.out.println("After notify, method of " + Thread.currentThread());

    }
  }
}
