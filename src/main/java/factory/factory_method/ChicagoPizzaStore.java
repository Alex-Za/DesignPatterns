package factory.factory_method;

import factory.factory_method.additional.ChicagoStyleCheesePizza;
import factory.factory_method.additional.ChicagoStyleVeggiePizza;
import factory.factory_method.interfaces.Pizza;
import factory.factory_method.interfaces.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
