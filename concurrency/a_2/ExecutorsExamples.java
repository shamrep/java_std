package concurrency.a_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class ExecutorsExamples {
    private static int c = 0;

    public static void main(String[] args) {
        var counter = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++) {
                    c++;
                    try {
                        sleep(3);
                        System.out.println("counter " + c);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable printer = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    sleep(5);
                } catch (Exception e) {

                }
            }
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            service.execute(counter);
            service.execute(printer);

            service.submit(counter);
        } finally {
            service.shutdown();
        }
    }
}
