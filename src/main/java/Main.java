
import bridge.Run;
import bridge.entity.Radio;
import bridge.entity.Tv;
import compound_patterns.DuckSimulator;
import compound_patterns.abstract_factory.AbstractDuckFactory;
import compound_patterns.abstract_factory.CountingDuckFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Run run = new Run();
        run.testDrive(new Tv());
        run.testDrive(new Radio());


    }


}
