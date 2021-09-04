package builder;

import builder.entity.Car;
import builder.entity.Director;
import builder.entity.Manual;

public class Run {
    public void run() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual build:\n" + carManual.print());
    }
}
