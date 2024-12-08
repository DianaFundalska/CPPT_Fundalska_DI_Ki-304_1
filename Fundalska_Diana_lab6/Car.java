package Fundalska_Diana_lab6;

public class Car implements Item {
    private String name;
    private int weight;
    private boolean isDefect;

    public Car(String name, int weight, boolean isDefect) {
        this.name = name;
        this.weight = weight;
        this.isDefect = isDefect;
    }

    @Override
    public int compareTo(Item item) {
        Integer w = weight;
        return w.compareTo(item.getWeight());
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void checkIfIsDefect() {
        if (isDefect)
            System.out.println("Car " + name + " has a defect");
        else
            System.out.println("Car " + name + " has no defects");
    }

    @Override
    public void print() {
        System.out.println("Car{name='" + name + "', weight=" + weight + ", isDefect=" + isDefect + "}");
    }
}