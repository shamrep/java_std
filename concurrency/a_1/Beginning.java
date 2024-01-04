package concurrency.a_1;

public class Beginning {
    public static void main(String[] args) {
        //Hello or world first?
        //Depending on the thread priority/scheduler, either is possible
        new Thread(() -> System.out.print("Hello ")).start();
        System.out.print("world!");
    }
}
