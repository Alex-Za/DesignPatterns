package factory.factory_method.additional;

import factory.factory_method.interfaces.Pizza;

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
