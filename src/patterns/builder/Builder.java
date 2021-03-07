package patterns.builder;

public interface Builder {
    Builder setWalls(int walls);
    Builder setDoors(int doors);
    Builder setWindows(int windows);
    Builder setType(String type);
    House build();
}
