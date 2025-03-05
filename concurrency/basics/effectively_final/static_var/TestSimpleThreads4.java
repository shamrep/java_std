package concurrency.basics.effectively_final.static_var;

public class TestSimpleThreads4 {

    private static int i = 0;
    private int j = 100;

    public static void main(String[] args) throws InterruptedException {

        Runnable r = () -> i--;
        new Thread(r).start();

        Thread.sleep(1000);

        System.out.println(i);

        TestSimpleThreads4 testSimpleThreads4 = new TestSimpleThreads4();

        Runnable r2 = () -> testSimpleThreads4.j++;

        new Thread(r2).start();

        Thread.sleep(1000);

        System.out.println("j = " + testSimpleThreads4.j);

    }

}
