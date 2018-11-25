package creation_pattern.builder.builder_simple;

import creation_pattern.builder.builder_simple.concret_builder.CarBuilder;
import creation_pattern.builder.builder_simple.concret_builder.ManualBuilder;
import creation_pattern.builder.builder_simple.product.Car;
import creation_pattern.builder.builder_simple.product.Manual;

public class Main {

    public static void main(String[] args) {

        CarBuilder builder = new CarBuilder();
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.build();
        System.out.println("Car built:\n" + car.getType());


        ManualBuilder manualBuilder = new ManualBuilder();
        manualBuilder.setType(Type.SUV);
        manualBuilder.setSeats(4);
        manualBuilder.setEngine(new Engine(2.5, 0));
        manualBuilder.setTransmission(Transmission.MANUAL);
        manualBuilder.setGPSNavigator(new GPSNavigator());
        manualBuilder.build();
        Manual manual = manualBuilder.build();
        System.out.println("CarManual built:\n"+manual.print());
    }
}
