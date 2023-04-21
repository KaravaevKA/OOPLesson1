package products;

public class Masks extends HygieneItems{
    public Masks(String title, Double price, Integer count, String unitOfMeasurement, Integer quantityInPackage) {
        super(title, price, count, unitOfMeasurement, quantityInPackage);
    }

    @Override
    public String toString() {
        return "Маски" + super.toString() + " масок";
    }
}
