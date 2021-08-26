package iterator;

import iterator.additional.MenuItem;
import iterator.interfaces.Menu;
import iterator.interfaces.MyIterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        MyIterator pancakeIterator = pancakeHouseMenu.getIterator();
        MyIterator dinerIterator = dinerMenu.getIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(MyIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printBreakfastMenu() {}
    public void printLunchMenu() {}
    public void printVegetarianMenu() {}
    public boolean isItemVegetarian() {
        return false;
    }
}
