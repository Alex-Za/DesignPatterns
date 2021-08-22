package decorator.example1;

import decorator.example1.additional.Mocha;
import decorator.example1.interfaces.Beverage;

public class Run {
    public void test() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }

}
