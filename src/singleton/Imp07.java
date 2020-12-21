package singleton;

// recommend to use
public class Imp07 {
    private Imp07() {}

    private static class Single {
        private static final Imp07 INSTANCE = new Imp07();
    }

    public static Imp07 getInstance() {
        return Single.INSTANCE;
    }
}
