package singleton;

public class Imp03 {
    private static Imp03 instance;
    private Imp03() {}

    public static Imp03 getInstance() {
        if (instance == null) {
            instance = new Imp03();
        }
        return instance;
    }
}
