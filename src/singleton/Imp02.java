package singleton;

public class Imp02 {
    private static Imp02 instance;

    private Imp02(){}

    static {
        instance = new Imp02();
    }

    public static Imp02 getInstance() {
        return instance;
    }
}
