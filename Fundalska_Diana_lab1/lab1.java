package Fundalska_Diana_lab1;

import java.io.*;
import java.util.*;

/**
 * Клас Lab1 реалізує приклад програми до лабораторної роботи №1
 */
public class lab1 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        String filler1 = "+";
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Enter the size of matrix : ");
        nRows = in.nextInt();
        in.nextLine();
        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[i + 1];
        }
        System.out.print("Enter the symbol: ");
        filler = in.nextLine();
        exit: for (int i = 0; i < nRows; i++) {
            for (int j = 0; j <= i && i + j < nRows; j++) {
                if (j <= i && i + j < nRows) {
                    if (filler.length() == 1) {
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    }
                } else {
                    if (filler1.length() == 1) {
                        arr[i][j] = (char) filler1.codePointAt(0);
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    }
                }

            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
