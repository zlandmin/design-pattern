package factory.simplefactory;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepared for cheese pizza....");
    }
}
