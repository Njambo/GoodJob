package GoodJob.Lesson24_GoodJob;

public class Test3 {
    public static void main(String[] args) {
        AbleToHelp h = new Driver();
        AbleToSwim s = new Driver();
        Employee e = new Driver();
        h.help();
        h.toPutOutAFire("воды");
        s.swim();
        System.out.println(h.a);
    }
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

class Teacher extends Employee implements AbleToHelp{
    int number_of_students; // количество студентов

    void teach() {
        System.out.println("учить");
    }
    public void help() {
        System.out.println("Учитель оказывает первую помощь");
    }
    public void toPutOutAFire(String subject) {
        System.out.println("учитель тушит пожар с помощью " + subject);
    }
}

class Driver extends Employee implements AbleToHelp, AbleToSwim {
    String car_name; // название автомобиля

    void to_drive() {
        System.out.println("водить");
    }
    public void help() {
        System.out.println("Водитель оказывает первую помощь");
    }
    public void toPutOutAFire(String subject) {
        System.out.println("Водитель тушит пожар с помощью " + subject);
    }
    public void swim() {
        System.out.println("Водитель умеет плавать");
    }
}

interface AbleToHelp {
 void help(); // помощь

    void toPutOutAFire(String subject);// Тушить пожар
    public final static int a = 10;
}
interface AbleToSwim {
void swim();
}
abstract class Y implements AbleToSwim {

}
abstract class X extends Y {

}
class  Z extends Y {
    public void swim() {

    }
}