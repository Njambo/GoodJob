package GoodJob.Lesson22_GoodJob;

public class Test3 {
    // увеличение зарплаты
    void salary_increase(Employee e) {
        e.salary = e.salary + 100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.to_heal();
    }
}

class Employee extends java.lang.Object {
    // зарплата
    double salary = 100;
    // имя
    String name;

    // возраст
    int age;
    // опыт
    int experience;

    void eat() {
        System.out.println("кушать");
    }

    void sleep() {
        System.out.println("спать");
    }
}

class Doctor extends Employee {

    void to_heal() {
        System.out.println("лечить");
    }
}


class Surgeon extends Doctor {
    // скальпель
    String scalpel;
    // операция
    void operation() {

    }
}
class dentist extends Doctor {

}

class Teacher extends Employee {
    int number_of_students; // количество студентов

    void teach() {
        System.out.println("учить");
    }
}

class Driver extends Employee {
    String car_name; // название автомобиля

    void to_drive() {
        System.out.println("водить");
    }
}
