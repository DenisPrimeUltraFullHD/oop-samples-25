/**
 * Клас Поставка — містить інформацію про поставку та товари
 */
import java.util.ArrayList;
import java.util.List;

public class Delivery {
    private String info;
    private List<Goods> goodsList = new ArrayList<>();
    private boolean completed = false;

    public Delivery(String info) {
        this.info = info;
        System.out.println("Створено поставку: " + info);
    }

    public void addGoods(Goods item) {
        goodsList.add(item);
        System.out.println("Додано товар до поставки: " + item.getInfo());
    }

    public void completeDelivery() {
        completed = true;
        System.out.println("Поставка завершена");
    }

    public String getInfo() {
        return info + ", кількість товарів: " + goodsList.size();
    }
}
