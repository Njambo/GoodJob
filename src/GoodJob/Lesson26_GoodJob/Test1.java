package GoodJob.Lesson26_GoodJob;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V4");
        Car car2 = new Car("red", "V4");
        Car car3 = new Car("black", "V6");
        ArrayList <Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        Car car4 = new Car("black", "V8");
        System.out.println(list);
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car2 = (Car) obj;
            return (color.equals(car2.color) && engine.equals(car2.engine));
        } else {
            return false;
        }
    }
    public String toString() {
        return ("Машина цвета: " + color +" и с мотором: " + engine);
    }
}