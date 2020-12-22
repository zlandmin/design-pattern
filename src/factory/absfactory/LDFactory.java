package factory.absfactory;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza create(String type) {
        if (type.equals("cheese")) {
            return new LDCheesePizza();
        } else if (type.equals("creek")) {
            return new LDCreekPizza();
        } else {
            return null;
        }
    }
}
