package factory.simplefactory;

public class CreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepared for a creek pizza....");
    }
}
