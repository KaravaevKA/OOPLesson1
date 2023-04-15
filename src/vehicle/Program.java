package vehicle;

import java.util.Arrays;

public class Program {




    public static void main(String[] args) {
        Transport[] transports = {new Car("Audi","Black",1800,210),
                new Truck("Man","Red",9000,140),
                new Bike("MaxxPro","Silver",5,20),
                new MotorBike("Kawasaki","Green",160,180)};
        for (Transport transport:transports) {
            getInfo(transport);
        }
    }
    public static void getInfo(Transport transport){
            System.out.println(transport.toString());
            transport.run();
    }
}

