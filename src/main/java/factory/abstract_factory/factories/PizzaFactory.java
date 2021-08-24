package factory.abstract_factory.factories;

import factory.abstract_factory.interfaces.Pizza;

public interface PizzaFactory {
    public Pizza createPizza(String type);
}
