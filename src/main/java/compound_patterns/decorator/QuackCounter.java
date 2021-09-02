package compound_patterns.decorator;

import compound_patterns.interfaces.Observer;
import compound_patterns.interfaces.Quackable;
import compound_patterns.observable.Observable;

public class QuackCounter implements Quackable {
    Quackable duck;
    public static int numberOfQuack;
    Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
        notifyObservers();
    }

    public static int getQuacks() {
        return numberOfQuack;
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
