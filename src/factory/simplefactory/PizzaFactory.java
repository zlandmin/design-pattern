package factory.simplefactory;

public class PizzaFactory {
    public Pizza create(String type) {
        if (type.equals("creek")) {
            return new CreekPizza();
        } else if (type.equals("cheese")) {
            return new CheesePizza();
        } else {
            return null;
        }
    }
}
