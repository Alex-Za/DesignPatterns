package strategy;

import strategy.additional.FlyRocketPowered;
import strategy.interfaces.Duck;

public class Run {
    public void test() {
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.fly();

        Duck model = new ModelDuck();
        model.fly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();
    }
}
