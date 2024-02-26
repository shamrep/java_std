package classes.interfaces;

public class TestDefaultMethods implements InterfaceWithDefaultMethods {
  public void simpleMethod() {
    System.out.println("Simple method");
  }

  public static void main(String[] args) {
    TestDefaultMethods test = new TestDefaultMethods();
    test.defaultMethod(10);
    test.simpleMethod();

    InterfaceWithDefaultMethods testInterface = new TestDefaultMethods();
    testInterface.defaultMethod(11);
  }
}
