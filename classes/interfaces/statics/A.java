package classes.interfaces.statics;

public class A implements I {
    public static void calculate() {
        System.out.println("Class A");
    }

    public int calculate(int a) {
        return 0;
    }

    public static void main(String[] args) {
       I i = new A();
//       comp error
//       i.calculate();
       A a  = new A();
       a.calculate();
    }
}
