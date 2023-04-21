package products;

public class Diapers extends ChildProducts{

    public Diapers(String title, Double price, Integer count, String unitOfMeasurement, Integer minAge, String hypoallergenic, Integer minWeight, Integer maxWeight) {
        super(title, price, count, unitOfMeasurement, minAge, hypoallergenic);
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    private Integer minWeight;
    private Integer maxWeight;

    @Override
    public String toString() {
        return "Подгузники " + super.toString() + ", " + "от " + minWeight + " до " + maxWeight + " кг ";
    }
}
