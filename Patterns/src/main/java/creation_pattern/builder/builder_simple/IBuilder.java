package creation_pattern.builder.builder_simple;

/**
 * Интерфейс строителя объявляет шаги конструирования продуктов,
 * общие для всех видов строителей.
 */
public interface IBuilder <T> {
    public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine (Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
