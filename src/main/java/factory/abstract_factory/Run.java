package factory.abstract_factory;

import factory.abstract_factory.factories.NYPizzaFactory;

public class Run {
    public void test() {
        PizzaStore pizzaStore = new PizzaStore(new NYPizzaFactory());
        pizzaStore.orderPizza("cheese");
    }
}
