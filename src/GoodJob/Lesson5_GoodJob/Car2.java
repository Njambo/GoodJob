package GoodJob.Lesson5_GoodJob;
public class Car2 {
    String color;
    String engine;
    int speed;

    int gas(int speed1) {
        speed += speed1;
        return speed;
    }

    int brake(int speed1) {
        speed -= speed1;
        return speed;
    }

    void showInfo() {
        System.out.println("цвет: " + color + "," + " мотор: " + engine + "," + " скорость: " + speed + " км/ч");
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.color = "белый";
        car.engine = "V6";
        car.speed = 60;
        car.showInfo();
        car.gas(20);
        car.showInfo();
        car.brake(80);
        car.showInfo();
    }
}