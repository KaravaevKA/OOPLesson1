package products;

public class Lemonade extends Drinks{

    public Lemonade(String title, Double price, Integer count, String unitOfMeasurement, Double volume) {
        super(title, price, count, unitOfMeasurement, volume);
    }

    @Override
    public String toString() {
        return "Лимонад " + super.toString();
    }
}
