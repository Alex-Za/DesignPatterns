package factory.abstract_factory.factories;

import factory.abstract_factory.additional.NYStyleCheesePizza;
import factory.abstract_factory.additional.NYStyleVeggiePizza;
import factory.abstract_factory.interfaces.Pizza;

public class NYPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
