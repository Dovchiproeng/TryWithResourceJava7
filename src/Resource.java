/**
 * Created by cdov on 6/13/17.
 */
public class Resource implements AutoCloseable {

    public Resource() throws Exception {
//        throw new Exception("Exception from constructor");
    }

    public void doSomething() throws Exception {
        System.out.println("Exception happen from method");
        throw new Exception("Exception from method");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing");
        throw new Exception("Exception from closeable");
    }
}
