package products.models;

public class HygieneItems extends Product{
    private Integer quantityInPackage;

    public HygieneItems(String title, Double price, Integer count, String unitOfMeasurement, Integer quantityInPackage) {
        super(title, price, count, unitOfMeasurement);
        this.quantityInPackage = quantityInPackage;
    }

    @Override
    public String toString() {
        return super.toString() + "кол-во в упаковке: " + quantityInPackage;
    }
}
