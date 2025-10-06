/**
 * Клас Оператор — відповідає за реєстрацію та відкриття поставки, а також групування замовлень
 */
public class Operator extends Person {
    public Operator(String name) {
        super(name);
    }

    // Зареєструвати попередню інформацію
    public void registerPreInfo() {
        System.out.println(getName() + ": зареєстровано попередню інформацію про поставку");
    }

    // Відкрити поставку
    public void openDelivery() {
        System.out.println(getName() + ": відкрито поставку");
    }

    // Групувати замовлення
    public void groupOrders() {
        System.out.println(getName() + ": згруповано замовлення");
    }

    @Override
    public void displayInfo() {
        System.out.println("Оператор: " + getName());
    }
}
