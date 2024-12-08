package Fundalska_Diana_lab6;

public class Ruler implements Item {
    private String name;
    private int length; // Використовуємо довжину замість ваги
    private boolean isDefect;

    public Ruler(String name, int length, boolean isDefect) {
        this.name = name;
        this.length = length;
        this.isDefect = isDefect;
    }

    @Override
    public int compareTo(Item item) {
        Integer l = length;
        return l.compareTo(item.getWeight());
    }

    @Override
    public int getWeight() {
        return length; // Вага виступає як довжина для лінійки
    }

    @Override
    public void checkIfIsDefect() {
        if (isDefect)
            System.out.println("Ruler " + name + " has a defect");
        else
            System.out.println("Ruler " + name + " has no defects");
    }

    @Override
    public void print() {
        System.out.println("Ruler{name='" + name + "', length=" + length + ", isDefect=" + isDefect + "}");
    }
}
