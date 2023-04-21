package products;

import java.util.Date;

public class Bread extends Food {
    public Bread(String title, Double price, Integer count, String unitOfMeasurement, Double expireDate, String flourType) {
        super(title, price, count, unitOfMeasurement, expireDate);
        this.flourType = flourType;
    }

    private String flourType;
    @Override
    public String toString() {
        return "Хлеб " + super.toString() + "," +" на " + flourType + " муке";
    }
}
