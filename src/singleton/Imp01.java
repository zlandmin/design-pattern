package singleton;

public class Imp01 {
    private Imp01() {}

    private final static Imp01 instance = new Imp01();

    public static Imp01 getInstance() {
        return instance;
    }
}
