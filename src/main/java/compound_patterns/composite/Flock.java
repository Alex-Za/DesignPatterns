package compound_patterns.composite;

import compound_patterns.interfaces.Observer;
import compound_patterns.interfaces.Quackable;
import compound_patterns.observable.Observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List quackers = new ArrayList();
    Observable observable;

    public Flock() {
        this.observable = new Observable(this);
    }

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }
}
