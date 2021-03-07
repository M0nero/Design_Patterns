package patterns.builder;

public class House {
    int walls;
    int doors;
    int windows;
    String type;
    public void print() {
        System.out.println("Walls: " +  walls + "\nDoors: " + doors + "\nWindows: " + windows + "\nType of house: " + type);
    }
}
