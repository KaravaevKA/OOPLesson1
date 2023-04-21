package products.models.base;

import products.models.Drinks;

public class Milk extends Drinks {

    public Milk(String title, Double price, Integer count, String unitOfMeasurement, Double volume, Integer fatContentPercentage, Double dateExp) {
        super(title, price, count, unitOfMeasurement, volume);
        this.fatContentPercentage = fatContentPercentage;
        this.dateExp = dateExp;
    }

    private Integer fatContentPercentage;
    private Double dateExp;

    @Override
    public String toString() {
        return "Молоко " + super.toString() +
                "жирность: " + fatContentPercentage + " % " +
                ", годен до: " + dateExp;
    }
}
