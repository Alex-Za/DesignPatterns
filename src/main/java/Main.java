
import state.GumballMachine;
import сomposite.Menu;
import сomposite.MenuComponent;
import сomposite.MenuItem;
import сomposite.Waitress;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }


}
