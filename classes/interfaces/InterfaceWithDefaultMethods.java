package classes.interfaces;

public interface InterfaceWithDefaultMethods {
  default void defaultMethod(int i) {
    System.out.println("i = " + i);
  }
}
