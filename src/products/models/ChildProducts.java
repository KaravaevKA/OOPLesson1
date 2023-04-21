package products.models;

public class ChildProducts extends Product {
    private Integer minAge;
    private String hypoallergenic;

    public ChildProducts(String title, Double price, Integer count, String unitOfMeasurement, Integer minAge, String hypoallergenic) {
        super(title, price, count, unitOfMeasurement);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() + "от " + minAge + " месяцев, " + hypoallergenic;
    }
}
