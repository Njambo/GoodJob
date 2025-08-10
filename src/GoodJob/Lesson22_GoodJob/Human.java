package GoodJob.Lesson22_GoodJob;

public class Human {

    // имя
   protected String name = "Коля";
    // зарплата
    protected static int salary = 150;

    // работа
    protected void work() {
        System.out.println("работать");
    }

    // остальное
    protected static void rest() {
        System.out.println("отдыхать");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}