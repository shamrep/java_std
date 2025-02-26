package classes.interfaces.default_exception;

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        //Problem: Java does not allow weakening checked exceptions when overriding.
//        obj.riskyMethod();
    }
}
