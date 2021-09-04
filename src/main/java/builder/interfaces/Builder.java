package builder.interfaces;

import builder.entity.Engine;
import builder.entity.GPSNavigator;
import builder.entity.TripComputer;
import builder.util.CarType;
import builder.util.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
