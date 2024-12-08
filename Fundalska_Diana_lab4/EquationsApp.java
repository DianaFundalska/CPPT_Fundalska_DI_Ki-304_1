package Fundalska_Diana_lab4;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class EquationsApp {
    public static void main(String[] args) {
        try {
            String directory = "JAVA4/";
            File dir = new File(directory);
            if (!dir.exists()) {
                dir.mkdir();
            }
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            String filePath = directory + fName;
            PrintWriter fout = new PrintWriter(new File(filePath));
            Equations eq = new Equations();
            out.print("Enter X: ");
            fout.print(eq.calculate(in.nextInt()));

            fout.flush();
            fout.close();
        } catch (FileNotFoundException | CalcException ex) {
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}
