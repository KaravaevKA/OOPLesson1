package vehicle;

public class Bike extends Transport{

    public Bike(String model, String color, Integer weight, Integer velocity) {
        super(model, color, 2, weight, velocity);
    }
    public void run(){
        System.out.println("Велосипед едет");
    }

    @Override
    public String toString() {
        return "Bike" + super.toString();
    }
}
