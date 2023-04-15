package vehicle;

public class MotorBike extends Transport{

    public MotorBike(String model, String color, Integer weight, Integer velocity) {
        super(model, color, 2, weight, velocity);
    }
    public void run(){
        System.out.println("Мотоцикл едет");
    }

    @Override
    public String toString() {
        return "MotorBike" + super.toString();
    }
}
