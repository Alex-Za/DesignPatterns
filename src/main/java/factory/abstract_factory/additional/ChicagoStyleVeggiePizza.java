package factory.abstract_factory.additional;

import factory.abstract_factory.interfaces.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Fresh Vegetables");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
