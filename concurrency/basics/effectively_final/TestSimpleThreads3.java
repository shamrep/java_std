package concurrency.basics.effectively_final;

import classes.interfaces.statics.I;

import java.sql.SQLOutput;

public class TestSimpleThreads3 {

    private static int j = 100;

    public static void main(String[] args) throws InterruptedException {

        Integer i = 1;

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
//java: local variables referenced from an inner class must be final or effectively final
//                i = Integer.valueOf(10);
//                i--;
                j--;
            }
        };

        System.out.println(test(i));
        System.out.println("i in main " + i);

        MyRunnableClass runnableClass = new MyRunnableClass();
        runnableClass.setI(i);

        Thread t1 = new Thread(runnableClass);
        t1.start();
        t1.join();


        System.out.println("MyRunnableClass i = " + runnableClass.getI());
        System.out.println("in main i = " + i);
        System.out.println("j = " + j);

    }

    static Integer test(Integer integer) {
        integer = 1000;
        return integer;
    }
}

