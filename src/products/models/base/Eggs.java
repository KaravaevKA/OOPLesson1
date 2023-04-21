package products.models.base;

import products.models.Food;

public class Eggs extends Food {
    public Eggs(String title, Double price, Integer count, String unitOfMeasurement, Double expireDate) {
        super(title, price, count, unitOfMeasurement, expireDate);
    }

    @Override
    public String toString() {
        return "Яйца " + super.toString();
    }
}
