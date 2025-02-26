package classes.interfaces.default_static;

public class C extends B implements A {
    //compilation error
    public static void main(String[] args) {
        C obj = new C();
        obj.show();

        A a = new C();
        a.show();
    }
}
