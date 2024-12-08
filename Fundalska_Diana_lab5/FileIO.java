package Fundalska_Diana_lab5;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class FileIO {

    public void writeTxt(String fName, double result) {
        try {

            PrintWriter f = new PrintWriter(fName);
            f.print(result);
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path " +
                    e);
        }
    }

    public double readTxt(String fName) {
        double result = 0;
        try {
            File file = new File(fName);
            Scanner scanner = new Scanner(file);
            scanner.useLocale(Locale.US);
            if (scanner.hasNextDouble()) {
                result = scanner.nextDouble();
                scanner.close();
            } else {
                System.err.println("The file does not contain a double value.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path");
        }
        return result;
    }

    public void writeBin(String fName, double result) {
        try {
            DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
            f.writeDouble(result);
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path " +
                    e);
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    public double readBin(String fName) {
        double result = 0;
        try {
            DataInputStream f = new DataInputStream(new FileInputStream(fName));
            result = f.readDouble();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path " +
                    e);
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        return result;
    }
}