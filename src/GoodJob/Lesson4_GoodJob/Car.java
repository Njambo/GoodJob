package GoodJob.Lesson4_GoodJob;

public class Car {
    Car(String colour, String motor) {
        color = colour;
        engine = motor;
        System.out.println("Цвет машины: " + color + " Мотор машины: " + engine);
    }

    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        System.out.println("car1");
        Car car1 = new Car("black,", "V8");
        System.out.println("car2");
        Car car2 = new Car("white,", "V6");
    }
}

