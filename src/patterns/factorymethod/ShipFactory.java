package patterns.factorymethod;

public class ShipFactory extends Factory {
    @Override
    public Transport create() {
        return new Ship();
    }
}
