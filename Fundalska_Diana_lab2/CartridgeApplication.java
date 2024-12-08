package Fundalska_Diana_lab2;

import java.io.IOException;

public class CartridgeApplication {

    public static void main(String[] args) {
        Cartridge myCartridge = new Cartridge("9mm", 15, "Handgun Cartridge");
        myCartridge.setCaliber("7.62mm");
        System.out.println("Cartridge's caliber: " + myCartridge.getCaliber());
        myCartridge.setCapacity(30);
        System.out.println("Cartridge's capacity: " + myCartridge.getCapacity());
        myCartridge.setType("Rifle Cartridge");
        System.out.println("Cartridge's type: " + myCartridge.getType());
        myCartridge.load();
        myCartridge.unload();
        myCartridge.checkCondition();
        try {
            myCartridge.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
