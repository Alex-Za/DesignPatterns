package iterator;

import iterator.additional.DinerMenu;
import iterator.additional.PancakeHouseMenu;

public class Run {
    public void run() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
