package Fundalska_Diana_lab6;

public class Main {
    public static void main(String[] args) {
        Drawer<Item> drawer = new Drawer<>();

        // Додаємо предмети у шухляду
        drawer.putItem(new Ruler("30cm Ruler", 30, false));
        drawer.putItem(new Wallet("Leather Wallet", 200, false));
        drawer.putItem(new Phone("Smartphone", 150, false));
        drawer.putItem(new Car("Toy Car", 500, true));
        drawer.putItem(new Cake("Birthday Cake", 1000, false));

        // Отримуємо та виводимо перший предмет
        Item firstItem = drawer.getItem(0);
        System.out.println("First item in the drawer:");
        firstItem.print();

        // Перевірка на дефект другого предмета
        Item secondItem = drawer.getItem(1);
        System.out.print("Checking second item for defects: ");
        secondItem.checkIfIsDefect();

        // Визначаємо та виводимо найлегший предмет
        Item lightestItem = drawer.getMin();
        System.out.println("\nThe lightest item in the drawer is:");
        lightestItem.print();
    }
}
