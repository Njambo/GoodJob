package GoodJob.Lesson23_GoodJob;

public class Test5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Teacher te = new Teacher();
        emp1.sleep();
        te.sleep();
        Employee emp2 = new Teacher();
        emp2.sleep();
    }
}

class Food {

}

class Fruit extends Food {

}
class Employee {
    double salary = 100;
    String name = "Kolya";

    public Food eat() {
        System.out.println("кушает работник");
        Food f = new Food();
        return f;
    }

    static void sleep() {
        System.out.println("спит работник");
    }
}

class Teacher extends Employee {
    int number_of_students; // количество студентов

    public Fruit eat() {
        System.out.println("кушает учитель");
        Fruit r = new Fruit();
        return r;
    }

    void teach() {
        System.out.println("учить");
    }
    static void sleep() {
        System.out.println("спит учитель");
    }
}