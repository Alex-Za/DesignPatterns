package factory.factory_method;

import factory.factory_method.additional.NYStyleCheesePizza;
import factory.factory_method.additional.NYStyleVeggiePizza;
import factory.factory_method.interfaces.Pizza;
import factory.factory_method.interfaces.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
