import java.util.List;

/**
 * Клас для обробки зарплати працівників
 */
public class Payroll {
    private List<Person> employees;
    private Paycheck paycheck;

    public Payroll(List<Person> employees) {
        this.employees = employees;
        System.out.println("Створено відомість для " + employees.size() + " працівників");
    }

    public void processPayroll(double salary) {
        System.out.println("Обробка зарплати...");
        
        for (Person person : employees) {
            double totalAmount = salary;
            
            if (person instanceof BonusEligible) {
                BonusEligible employee = (BonusEligible) person;
                totalAmount += employee.getBonus();
            }
            
            this.paycheck = new Paycheck(totalAmount, "28.09.2025");
            System.out.println("Зарплата оброблена для: " + person.getName());
            this.paycheck.displayPaycheckInfo();
        }
    }
}
