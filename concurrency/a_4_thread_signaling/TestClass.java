package concurrency.a_4_thread_signaling;

public class TestClass {
  public static void main(String[] args) {
    Object obj = new Object();

    Example ex = new Example(obj);

    Thread t1 = new Thread(()->{
      ex.methodWait();
    });

    Thread t2 = new Thread(()-> {
      ex.methodNotify();
    });


    t2.start();
    t1.start();








  }
}
