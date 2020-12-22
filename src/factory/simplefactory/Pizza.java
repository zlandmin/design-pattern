package factory.simplefactory;

public abstract class Pizza {

    public abstract void prepare();

    public void bake() {
        System.out.println("bake the pizza...");
    }

    public void cut() {
        System.out.println("cut the pizza....");
    }

    public void box() {
        System.out.println("box the pizza...");
    }
}
