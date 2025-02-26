package classes.interfaces.default_exception;

public class B implements A {
    @Override
    public void riskyMethod() throws RuntimeException {
        throw new RuntimeException("B's exception");
    }
}
