package factory.factorymethod;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare LD cheese pizza....");
    }
}
