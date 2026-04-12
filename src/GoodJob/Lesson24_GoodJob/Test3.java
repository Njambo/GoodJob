package GoodJob.Lesson24_GoodJob;

public class Test3 {
}

class Employee {
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
interface AbleToHelp {
    void help();
    void ToPutOutAFire(); // Тушить пожар
}