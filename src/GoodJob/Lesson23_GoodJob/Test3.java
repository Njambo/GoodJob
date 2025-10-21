package GoodJob.Lesson23_GoodJob;

public class Test3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.eat();
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("кушать");
    }

    void sleep() {
        System.out.println("спать");
    }
}

class Teacher extends Employee {
    int number_of_students; // количество студентов

    void teach() {
        System.out.println("учить");
    }
}