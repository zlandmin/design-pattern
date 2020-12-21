package singleton;

// recommend to use
public class Imp06 {
    private static volatile Imp06 instance;
    private Imp06() {

    }

    public static Imp06 getInstance() {
        if (instance == null) {
            synchronized (Imp06.class) {
                if (instance == null) {
                    instance = new Imp06();
                }
            }
        }
        return instance;
    }
}
