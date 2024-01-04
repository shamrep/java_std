package concurrency.a_1;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class SleepAndInterrupt {
    static int counter = 0;
    public static void main(String[] args) {
        var t = currentThread();
        new Thread(() -> {
            for (int i = 0; i < 1_000_000_000; i++) {
                counter++;
            }
            t.interrupt();
        }).start();

        while(counter < 1_000_000_000) {
            System.out.println("not reached 1 000 000");
            try {
                sleep(50);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                System.out.println(e);
                System.out.println("was interrupted");
            }
        }

        System.out.println("reached 1 000 000");
    }
}
