package products;

public class Drinks extends Product{
    private Double volume;

    public Drinks(String title, Double price, Integer count, String unitOfMeasurement, Double volume) {
        super(title, price, count, unitOfMeasurement);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + "объем " + volume + " л ";
    }
}
