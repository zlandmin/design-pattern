package strategy;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

    public void fly() {
        flyBehavior.fly();
    }
}
