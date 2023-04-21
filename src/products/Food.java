package products;

import java.util.Date;

public class Food extends Product{
    private Double expireDate;

    public Food(String title, Double price, Integer count, String unitOfMeasurement, Double expireDate) {
        super(title, price, count, unitOfMeasurement);
        this.expireDate = expireDate;
    }



    @Override
    public String toString() {
        return
                super.toString() + "годен до: " + expireDate;
    }
}
