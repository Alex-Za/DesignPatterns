package iterator.additional;

import iterator.PancakeHouseMenuIterator;
import iterator.interfaces.Menu;
import iterator.interfaces.MyIterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItems("Second Test name", "Second Test description", true, 2.99);
        addItems("Second Test2 name", "Second Test2 description", false, 1.99);
        addItems("Second Test3 name", "Second Test3 description", true, 2.20);
        addItems("Second Test4 name", "Second Test4 description", false, 2.40);
    }

    public void addItems(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public MyIterator getIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
