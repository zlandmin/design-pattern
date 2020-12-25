package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temp;
    private float pressure;

    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    public void setData(float temp, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        this.notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(observer -> observer.update(this.temp, this.pressure));
    }
}
