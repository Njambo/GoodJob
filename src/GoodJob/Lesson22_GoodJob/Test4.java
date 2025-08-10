package GoodJob.Lesson22_GoodJob;

public class Test4 {
}
class Human2 {
    Human2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    String name;
    String surname;
}
class Student2 extends Human2 {
    int course;
    Student2(String name, String surname, int course) {
        super(name, surname);
        this.course = course;
    }

    public static void main(String[] args) {
        Student2 s2 = new Student2("Коля", "Иванов", 3);
        System.out.println(s2.name);
        System.out.println(s2.surname);
        System.out.println(s2.course);
    }
}