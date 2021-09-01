package compound_patterns.entity;

import compound_patterns.interfaces.Quackable;

import java.util.Observer;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
