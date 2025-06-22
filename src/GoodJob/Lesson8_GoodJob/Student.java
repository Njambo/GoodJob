package GoodJob.Lesson8_GoodJob;
public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Студент № " + count + " создан");
    }

    public static void showCount() {
        System.out.println("Всего создана студентов: " + count);
    }

    public void showInfo() {
        System.out.println("Добро пожаловать в студенческий класс!!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student student2 = new Student("Nikita", 1);
        student2.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student student3 = new Student("Petr", 4);
        student3.abc();
    }
}