package GoodJob.Lesson16_.GoodJob;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;
    public Car abc(String color) {
        Car car2 = new Car(color, "V4");
        return car2;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "V6");
        Car car3 = car1.abc("black");
        System.out.println(car1.color);
    }
}
