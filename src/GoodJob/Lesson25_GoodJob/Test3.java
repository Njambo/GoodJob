package GoodJob.Lesson25_GoodJob;

public class Test3 {
    public static void main(String[] args) {

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();

        Employee[] array = {emp1, emp2, emp3, emp4};
        for (Employee e : array) {
            if (e instanceof Driver) {
                System.out.println((((Driver) e).nazvanieMashini));
                ((Driver) e).vodit();
            }
        }
    }
}

class Employee extends java.lang.Object {
    double salary = 100;
    String name = "Коля";
    int age;
    int experince;

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Doctor extends Employee implements Help_able {
    String specializaciya = "xirurg";

    public void help() {
        System.out.println("Доктор оказывает помощь");
    }

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini = "BNW";

    void vodit() {
        System.out.println("Vodit");
    }
}

interface Help_able {
    void help();
}