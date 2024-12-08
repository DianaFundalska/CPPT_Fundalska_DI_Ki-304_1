package Fundalska_Diana_lab6;

public interface Item extends Comparable<Item> {
    int getWeight();

    void checkIfIsDefect();

    void print();
}
