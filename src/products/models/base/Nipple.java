package products.models.base;

import products.models.ChildProducts;

public class Nipple extends ChildProducts {
    public Nipple(String title, Double price, Integer count, String unitOfMeasurement, Integer minAge, String hypoallergenic) {
        super(title, price, count, unitOfMeasurement, minAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return "Соска " + super.toString();
    }
}
