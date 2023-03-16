package Opgave3;

public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfLamps() {
        return this.numberOfLamps;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
