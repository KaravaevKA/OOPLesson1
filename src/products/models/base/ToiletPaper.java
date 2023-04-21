package products.models.base;

import products.models.HygieneItems;

public class ToiletPaper extends HygieneItems {
    public ToiletPaper(String title, Double price, Integer count, String unitOfMeasurement, Integer quantityInPackage, Integer numberOfLayers) {
        super(title, price, count, unitOfMeasurement, quantityInPackage);
        this.numberOfLayers = numberOfLayers;
    }

    private Integer numberOfLayers;
    @Override
    public String toString() {
        return "Туалетная бумага " + super.toString() + " рулона" + ", " + numberOfLayers+ " слоя";
    }
}
