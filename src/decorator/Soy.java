package decorator;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDescription("soy");
        setPrice(3.0);
    }
}
