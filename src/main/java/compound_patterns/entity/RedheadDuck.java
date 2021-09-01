package compound_patterns.entity;

import compound_patterns.interfaces.Quackable;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
