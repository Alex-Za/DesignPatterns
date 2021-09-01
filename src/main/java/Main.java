
import compound_patterns.DuckSimulator;
import compound_patterns.abstract_factory.AbstractDuckFactory;
import compound_patterns.abstract_factory.CountingDuckFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        duckSimulator.simulate(duckFactory);
    }


}
