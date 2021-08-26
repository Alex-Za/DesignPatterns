package iterator;

import iterator.additional.MenuItem;
import iterator.interfaces.MyIterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements MyIterator {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem)menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
