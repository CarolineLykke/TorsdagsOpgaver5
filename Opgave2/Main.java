package Opgave2;

public class Main {
    public static void main(String[] args) {
        Cafe c = new Cafe();
        c.loadMenuData();
        for (String s: c.getCoffeeMenu()) {
            System.out.println(s);
        }
    }
}
