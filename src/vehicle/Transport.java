package vehicle;

public class Transport {
    public Transport(String model,String color, Integer wheelsCount,  Integer weight, Integer velocity) {
        this.model = model;
        this.color = color;
        this.wheelsCount = wheelsCount;
        this.weight = weight;
        this.velocity = velocity;
    }

    private String color;
    private Integer wheelsCount;
    private String model;
    private Integer weight;
    private Integer velocity;

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", wheelsCount=" + wheelsCount +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", velocity=" + velocity +
                '}';
    }

    public void run() {
    }
}
