/**
 * Клас Комірник — відповідає за сканування та розміщення товарів
 */
public class Storekeeper extends Person {
    public Storekeeper(String name) {
        super(name);
    }

    // Сканувати товари
    public void scanGoods() {
        System.out.println(getName() + ": відскановано товари");
    }

    // Розмістити товари за датою
    public void placeGoodsByDate() {
        System.out.println(getName() + ": розміщено товари за строком придатності");
    }

    @Override
    public void displayInfo() {
        System.out.println("Комірник: " + getName());
    }
}
