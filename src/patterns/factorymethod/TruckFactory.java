package patterns.factorymethod;

public class TruckFactory extends Factory {
    @Override
    public Transport create() {
        return new Truck();
    }
}
