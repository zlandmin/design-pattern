package decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDescription("chocolate");
        setPrice(3.0);
    }
}
