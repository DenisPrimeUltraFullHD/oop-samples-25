/**
 * Головний клас для запуску імітаційного прототипу системи доставки
 */
public class Main {
    public static void main(String[] args) {
        // Створення учасників
        Operator operator = new Operator("Іван");
        Storekeeper storekeeper = new Storekeeper("Петро");
        Driver driver = new Driver("Олег");

        // Оператор реєструє та відкриває поставку
        operator.registerPreInfo();
        Delivery delivery = new Delivery("Поставка №1");
        operator.openDelivery();
        operator.groupOrders();

        // Комірник сканує та розміщує товари
        Goods goods1 = new Goods("12345", "2025-12-31");
        Goods goods2 = new Goods("67890", "2026-01-15");
        storekeeper.scanGoods();
        delivery.addGoods(goods1);
        delivery.addGoods(goods2);
        storekeeper.placeGoodsByDate();

        // Водій здає вантаж та отримує маршрутний лист
        driver.handoverCargo();
        delivery.completeDelivery();
        driver.getRouteSheet();
    }
}
