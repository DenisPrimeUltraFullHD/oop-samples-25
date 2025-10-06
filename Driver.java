/**
 * Клас Водій — відповідає за здачу вантажу та отримання маршрутного листа
 */
public class Driver extends Person {
    public Driver(String name) {
        super(name);
    }

    // Здати вантаж
    public void handoverCargo() {
        System.out.println(getName() + ": здав вантаж");
    }

    // Отримати маршрутний лист
    public void getRouteSheet() {
        System.out.println(getName() + ": отримав маршрутний лист");
    }

    @Override
    public void displayInfo() {
        System.out.println("Водій: " + getName());
    }
}
