import java.util.Scanner;

import patterns.singleton.*;
import patterns.factorymethod.*;
import patterns.builder.*;

public class Main {
    private static void testSingleton() {
        System.out.print("City: " + Database.getInstance().getCity());
    }

    private static void testFactory(Scanner scanner) {
        Factory factory = null;

        System.out.println("How to deliver?");
        System.out.println("1. By truck\n2. By ship");

        switch (scanner.nextInt()) {
            case 1:
                factory = new TruckFactory();
                break;
            case 2:
                factory = new ShipFactory();
                break;
        }

        factory.deliver();
    }

    private static void testAbstractFactory(Scanner scanner) {
    }

    private static void testBuilder() {
        House house = new HouseBuilder().setWalls(4).setDoors(2).setWindows(4).setType("WithGarage").build();
        house.print();
    }

    public static void main(String[] args) {
        System.out.println("Which pattern to test?");
        System.out.println("1. Singleton\n2. Factory Method\n3. Abstract Factory\n4. Builder");

        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                testSingleton();
                break;
            case 2:
                testFactory(scanner);
                break;
            case 4:
                testAbstractFactory(scanner);
                break;
            case 3:
                testBuilder();
                break;
        }
    }
}