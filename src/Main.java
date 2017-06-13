/**
 * Created by cdov on 6/13/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // try with resource will close the resource before throwing any exception
        try {
            tryWithoutCatch();
        }catch (Exception e){
            System.out.println("Catch in main");
        }
        System.out.println("******Start try with catch*********");

        tryWithCatch();
    }

    static void tryWithoutCatch() throws Exception {
        try(Resource r = new Resource()) {
            r.doSomething();
        }
    }

    static void tryWithCatch()  {
        try(Resource r = new Resource()) {
            r.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
