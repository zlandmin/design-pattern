package singleton;

public class Imp05 {
    private static Imp05 instance;
    private Imp05() {}

    public static Imp05 getInstance() {
        if (instance == null) {
            synchronized (Imp05.class) {
                instance = new Imp05();
            }
        }
        return instance;
    }
}
