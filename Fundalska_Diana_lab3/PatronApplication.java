package Fundalska_Diana_lab3;

import java.io.IOException;

public class PatronApplication {

    public static void main(String[] args) {
        Patron basicPatron = new Patron("9mm", 10);
        basicPatron.fire();
        basicPatron.reload(5);
        System.out.println("Patron's caliber: " + basicPatron.getCaliber());
        System.out.println("Patron's ammo count: " + basicPatron.getQuantity());

        SmartPatron smartPatron = new SmartPatron("5.56mm", 15, "single shot");
        smartPatron.setFireMode("burst mode");
        System.out.println("SmartPatron's caliber: " + smartPatron.getCaliber());
        System.out.println("SmartPatron's ammo count: " + smartPatron.getQuantity());
        smartPatron.fire();
        smartPatron.advancedFireMode("single shot");

        try {
            basicPatron.dispose();
            smartPatron.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
