package concurrency.basics;

import java.util.stream.IntStream;

public class TestSimpleThreads {

    public static void main(String[] args) throws InterruptedException {

        MyInt sum = new MyInt(0);

        System.out.println(sum.getI());

        Runnable task1 = () -> sum(1, 500, sum);


        Thread t = new Thread(task1);
        t.start();

        t.join();
        System.out.println(sum.getI());

    }

    public static int sum(int from, int to, MyInt sum) {
        sum.setI(IntStream.range(from, to).sum());
        System.out.println(Thread.currentThread().getName() + " " + sum.getI());
        return sum.getI();
    }

    static class MyInt {
        private int i;

        public MyInt(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

}
