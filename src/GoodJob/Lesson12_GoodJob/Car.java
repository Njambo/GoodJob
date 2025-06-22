package GoodJob.Lesson12_GoodJob;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(3, 4);
        Car car2 = new Car(2, 5);
        if (car1.engine > car2.engine) {
            if (car1.doorCount > car2.doorCount) {
                System.out.println("Мощность мотора и количество дверей у первой машины больше");

            } else {
                System.out.println("Мощность мотора у первой машины больше, а количество дверей меньше");
            }
        } else {
            System.out.println("Мощность мотора у первой машины меньше");
        }
    }
}