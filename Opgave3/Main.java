package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(6, 3, false, new ArrayList<Room>());
        building.getRooms().add(new Room(3, 5, 8));
        building.getRooms().add(new Room(6, 2, 4));
        building.getRooms().add(new Room(10, 7, 4));

        int totalLamps = countLampsInBuilding(building);
        System.out.println("There are " +totalLamps+ " lamps in the building");

        boolean isNormal = isNormal(building);
        System.out.println("Is the building normal? " + isNormal);
    }


    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        List<Room> rooms = building.getRooms();
        for (Room room : rooms) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    private static boolean isNormal(Building building) {
        int numberOfRooms = building.getRooms().size();
        int numberOfFloors = building.getNumberOfFloors();
        if (numberOfFloors > numberOfRooms) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }

    }
}
