package adapter;

import adapter.additional.MallardDuck;
import adapter.additional.WildTurkey;
import adapter.interfaces.Duck;

public class Run {

    public void run() {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
