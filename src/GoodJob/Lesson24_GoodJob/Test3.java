package GoodJob.Lesson24_GoodJob;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.help();
        h.tushitPojar("воды");
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int excperience;

    void eat() {
        System.out.println("кушать");
    }

    void sleep() {
        System.out.println("спать");
    }
}

class Teacher extends Employee implements Help_able {
    // количество учеников
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("учит");
    }

    public void help() {
        System.out.println("учитель оказывает помощь");
    }

    public void tushitPojar(String s) {
        System.out.println("учитель тушет пожар" + s);
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    // название машины
    String nazvanieMashini;

    void vodit() {
        System.out.println("Водит");
    }

    public void help() {
        System.out.println("водитель оказывает помощь");
    }

    public void tushitPojar(String s) {
        System.out.println("водитель тушет пожар" + s);
    }

    public void swim() {
        System.out.println("водитель умеет плавать");
    }
}

interface Help_able {
    // помощь
    public abstract void help();

    // тушить пожар
    void tushitPojar(String predmet);
    public final static int a = 10;
}

interface Swim_able {
    // плавать
    void swim();
}

abstract class Y implements Swim_able {

}
abstract class X extends Y {

}
class Z extends Y {
    public void swim() {

    }
}