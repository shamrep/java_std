package classes.interfaces.default_exception;

public interface A {
    default void riskyMethod() throws Exception {
        throw new Exception("Something went wrong!");
    }
}
