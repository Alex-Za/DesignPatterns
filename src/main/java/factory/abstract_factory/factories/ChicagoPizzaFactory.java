package factory.abstract_factory.factories;

import factory.abstract_factory.additional.ChicagoStyleCheesePizza;
import factory.abstract_factory.additional.ChicagoStyleVeggiePizza;
import factory.abstract_factory.interfaces.Pizza;

public class ChicagoPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
