package template_method;

import template_method.additional.Coffee;
import template_method.additional.Tea;

public class Run {
    public void run() {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
