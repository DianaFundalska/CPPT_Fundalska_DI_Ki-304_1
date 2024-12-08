package Fundalska_Diana_lab2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cartridge {
    private String caliber;
    private int capacity;
    private String type;
    private String logFileName;
    private FileWriter logFileWriter;

    public Cartridge() {
        this.caliber = "";
        this.capacity = 0;
        this.type = "";
        logFileName = "Java2/cartridgeLog.txt";

        try {
            logFileWriter = new FileWriter(new File(logFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Cartridge(String caliber, int capacity, String type) {
        this.caliber = caliber;
        this.capacity = capacity;
        this.type = type;
        logFileName = "Diana/D_2/cartridgeLog.txt";
        try {
            logFileWriter = new FileWriter(new File(logFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCaliber() {
        return caliber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public void load() {
        log(caliber + " cartridge is loaded.");
    }

    public void unload() {
        log(caliber + " cartridge is unloaded.");
    }

    public void checkCondition() {
        log(caliber + " cartridge is being checked for condition.");
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
