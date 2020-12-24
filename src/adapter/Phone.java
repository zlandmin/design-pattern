package adapter;

public class Phone {
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("output 5V, good to charge...");
        } else {
            System.out.println("not good to charge...");
        }
    }
}
