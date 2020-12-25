package observer;

public class CurrentCondition implements Observer {

    @Override
    public void update(float temp, float pressure) {
        System.out.println("current temp: " + temp + " && " + "pressure: " + pressure);
    }
}
