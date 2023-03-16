package Opgave1;

import java.util.ArrayList;

//Task 1: ArrayList og objekter
// 1.a Lav en klasse, Customer, med attributterne (felterne/instansvariablene):
// String firstName String lastName String username int id
// 1.b Klassen skal have en konstruktør, der tager kundens navn og brugernavn som parametre.
// Giv klassen en toString() metode, der printer kundens detaljer pænt ud.
// Gør alle klassens felter private,og tilføj getters().
// 1.c Skriv en Main klasse med en main metode, hvor der oprettes en ArrayList, som du kalder 'customers'.
// Denne skal være erklæret som static global variabel - dvs tilgængelig udenfor main metoden.
// Tilføj 6 instanser af Customer-klassen til listen customers. Dette gør du i main-metoden.
// (Du kan oprette instanserne først, og så add'e dem til array'et. Du kan også adde og instantiere i samme linie.)
// 1.d Skriv en static metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud ved at gennemløbe
// 'customers' med et ’for each’ loop. Test metoden fra main ved at kalde den.
public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        customers.add(new Customer("Caroline", "Holmstrøm","caro0501"));
        customers.add(new Customer("Julie", "Lykke","Jul0710"));
        customers.add(new Customer("Jonas", "Jørgensen","KongJonas"));
        customers.add(new Customer("Thomas", "Steenmann","ThoSte123"));
        customers.add(new Customer("Maja", "Strauss","MaSt0503"));
        customers.add(new Customer("Mikkel", "Jensen","Lekkim2468"));

        printCustomers();
    }
    public static void printCustomers(){
        for(Customer c: customers){
            System.out.println(c);
        }
    }

}