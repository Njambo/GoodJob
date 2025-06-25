package GoodJob.Lesson13_GoodJob;

public class Test1 {

}

class Student3 {
    int grade;

    Student3(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student3 student = new Student3(3);
        switch (student.grade) {
            case 2:
                System.out.println("Студент двоечник");
                break;
            case 3:
                System.out.println("студент троечник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println(" оценка неверна");
        }
    }
}