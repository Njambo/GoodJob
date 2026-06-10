package GoodJob.Lesson25_GoodJob;


public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        emp1.work();
        emp2.work();
        emp3.work();
        String s1 = null;
//        Employee [] array2 = {emp1, emp2, emp3};
//        for (Employee emp:array2) {
//            emp.work();
//        }
        System.out.println(s1 instanceof String);
    }
}

abstract class Employee implements Help_able{
    void sleep() {
        System.out.println("employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {
    public void help() {
        System.out.println("Teacher helps");
    }

    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {
    public void help() {
        System.out.println("Driver helps");
    }

    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements Help_able {
    public void help() {
        System.out.println("Doctor helps");
    }
    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help();
}