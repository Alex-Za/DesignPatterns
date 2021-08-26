package сomposite;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    ArrayList menuComponent = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {

    }

    @Override
    public void remove(MenuComponent menuComponent) {
        super.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return super.getChild(i);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void print() {
        super.print();
    }
}
