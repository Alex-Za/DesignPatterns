package strategy;

import strategy.additional.FlyWithWings;
import strategy.additional.Quack;
import strategy.interfaces.Duck;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
