package compound_patterns.entity;

import compound_patterns.interfaces.Observer;
import compound_patterns.interfaces.Quackable;
import compound_patterns.observable.Observable;

public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
