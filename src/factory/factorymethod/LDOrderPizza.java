package factory.factorymethod;

public class LDOrderPizza extends OrderPizza {
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
