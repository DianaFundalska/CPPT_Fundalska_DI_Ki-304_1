package Fundalska_Diana_lab6;

import java.util.ArrayList;

public class Drawer<T extends Item> {
    private ArrayList<T> arr;

    public Drawer() {
        arr = new ArrayList<>();
    }

    public void putItem(T item) {
        arr.add(item);
        System.out.print("Item added: ");
        item.print();
    }

    public T getItem(int index) {
        return arr.get(index);
    }

    public T getMin() {
        if (!arr.isEmpty()) {
            T min = arr.get(0);
            for (T item : arr) {
                if (item.compareTo(min) < 0) {
                    min = item;
                }
            }
            return min;
        }
        return null;
    }

    public void checkIfItemIsDefect(int index) {
        arr.get(index).checkIfIsDefect();
    }
}
