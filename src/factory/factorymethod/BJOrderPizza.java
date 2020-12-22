package factory.factorymethod;

public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza create(String type) {
        if (type.equals("cheese")) {
            return new BJCheesePizza();
        } else if (type.equals("creek")) {
            return new BJCreekPizza();
        } else {
            return null;
        }
    }
}
