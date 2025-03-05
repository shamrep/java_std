package concurrency.basics.effectively_final;

public class MyRunnableClass implements Runnable {

    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    @Override
    public void run() {
        i++;
        System.out.println(i);
    }
}
