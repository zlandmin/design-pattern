package factory.absfactory;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for BJ cheese pizza...");
    }
}
