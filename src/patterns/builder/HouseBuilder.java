package patterns.builder;

public class HouseBuilder implements Builder{
    House house = new House();

    @Override
    public Builder setWalls(int walls) {
        house.walls = walls;
        return this;
    }

    @Override
    public Builder setDoors(int doors) {
        house.doors = doors;
        return this;
    }

    @Override
    public Builder setWindows(int windows) {
        house.windows = windows;
        return this;
    }

    @Override
    public Builder setType(String type) {
        house.type = type;
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
