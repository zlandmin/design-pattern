package strategy;

public class ToyDuck extends Duck {
    public ToyDuck() {
        this.flyBehavior = new BadFlyBehavior();
    }

    public void setFlyBehavior(FlyBehavior behavior) {
        this.flyBehavior = behavior;
    }
}
