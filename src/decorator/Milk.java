package decorator;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDescription("milk");
        setPrice(2.0);
    }
}
