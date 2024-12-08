package Fundalska_Diana_lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Patron {
    private String caliber;
    private int quantity;
    public String logFileName;
    public FileWriter logFileWriter;

    public Patron() {
        this.caliber = "";
        this.quantity = 0;
        logFileName = "patronLog.txt";
        try {
            logFileWriter = new FileWriter(new File(logFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Patron(String caliber, int quantity) {
        this.caliber = caliber;
        this.quantity = quantity;
        logFileName = "patronLog.txt";
        try {
            logFileWriter = new FileWriter(new File(logFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void fire() {
        if (quantity > 0) {
            quantity--;
            log("Fired one round. Remaining quantity: " + quantity);
        } else {
            log("No ammo left to fire.");
        }
    }

    public void reload(int additionalAmmo) {
        quantity += additionalAmmo;
        log("Reloaded. Current ammo: " + quantity);
    }

    public void log(String message) {
        try {
            logFileWriter.write(message + "\n");
            logFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dispose() throws IOException {
        logFileWriter.close();
    }
}
