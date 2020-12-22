package factory.absfactory;

public class OrderPizza {
    private AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        this.factory = factory;
    }

    public Pizza create(String type) {
        return this.factory.create(type);
    }
}
