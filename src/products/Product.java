package products;

public class Product {
    public Product(String title, Double price, Integer count, String unitOfMeasurement) {
        this.title = title;
        this.price = price;
        this.count = count;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    private String title;
    private Double price;
    private Integer count;
    private String unitOfMeasurement;

    @Override
    public String toString() {
        return "'" + title + '\'' +
                ", цена: " + price + " рублей " +
                ", количество: " + count +
                " " + unitOfMeasurement + " ";
    }
}
