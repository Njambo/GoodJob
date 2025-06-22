package GoodJob.Lesson11_GoodJob;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    // swap - менять
    public static void swap(Student student1, Student student2) {
        Student student3 = student1;
        student1 = student2;
        student2 = student3;
        System.out.println(student1.name);
        System.out.println(student2.name);
        student3 = null;
    }

    public static void changeName(Student student1) {
        student1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 3, 9.5);
        Student student2 = new Student("Petr", 1, 5.3);
        changeName(student2);
        System.out.println(student2.name);
    }
}