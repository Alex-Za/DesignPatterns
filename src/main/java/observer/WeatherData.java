package observer;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private boolean changed;

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            for (Observer observer : observers) {
                observer.update(temperature, humidity, pressure);
            }
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    private void setChanged() {
        if (true) { //conditions
            changed = true;
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        measurementsChanged();
    }
}
