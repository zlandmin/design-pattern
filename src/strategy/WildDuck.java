package strategy;

public class WildDuck extends Duck {
    public WildDuck() {
        this.flyBehavior = new GoodFlyBehavior();
    }

    public void setFlyBehavior(FlyBehavior behavior) {
        this.flyBehavior = behavior;
    }
}
