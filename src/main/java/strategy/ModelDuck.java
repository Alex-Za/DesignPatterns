package strategy;

import strategy.additional.FlyNoWay;
import strategy.additional.Quack;
import strategy.interfaces.Duck;

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a model duck");
    }

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
}
