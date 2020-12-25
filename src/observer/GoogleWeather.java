package observer;

public class GoogleWeather implements Observer {
    @Override
    public void update(float temp, float pressure) {
        System.out.println("google shows temp: " + temp + " && " + "pressure: " + pressure);
    }
}
