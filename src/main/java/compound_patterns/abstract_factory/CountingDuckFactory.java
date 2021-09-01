package compound_patterns.abstract_factory;

import compound_patterns.decorator.QuackCounter;
import compound_patterns.entity.DuckCall;
import compound_patterns.entity.MallardDuck;
import compound_patterns.entity.RedheadDuck;
import compound_patterns.entity.RubberDuck;
import compound_patterns.interfaces.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
