package vehicle;

public class Truck extends Transport{
    public Truck(String model, String color, Integer weight, Integer velocity) {
        super(model, color, 6, weight, velocity);
    }
    public void run(){
        System.out.println("Грузовик едет");
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }
}
