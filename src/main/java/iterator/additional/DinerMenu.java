package iterator.additional;

import iterator.DinerMenuIterator;
import iterator.interfaces.Menu;
import iterator.interfaces.MyIterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Test name", "Test description", true, 2.99);
        addItem("Test2 name", "Test2 description", false, 2.28);
        addItem("Test3 name", "Test3 description", true, 3.99);
        addItem("Test4 name", "Test4 description", false, 1.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MyIterator getIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
