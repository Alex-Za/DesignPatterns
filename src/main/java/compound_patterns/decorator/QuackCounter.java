package compound_patterns.decorator;

import compound_patterns.interfaces.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    public static int numberOfQuack;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }

    public static int getQuacks() {
        return numberOfQuack;
    }
}
