package singleton;

public class Imp04 {
    private static Imp04 instance;
    private Imp04() {}

    public static synchronized Imp04 getInstance() {
        if (instance == null) {
            instance = new Imp04();
        }
        return instance;
    }
}
