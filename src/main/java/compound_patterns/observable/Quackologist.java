package compound_patterns.observable;

import compound_patterns.interfaces.Observer;
import compound_patterns.interfaces.QuackObservable;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
