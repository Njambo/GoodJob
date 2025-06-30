package GoodJob.Lesson16_.GoodJob;

public class Test4 {
}
class Employee {
    double salary;
    boolean isManager;
    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}
class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(100.5, true);
        System.out.println("Он мессенджер? " + employee1.isManager + " У него зарплата: " + employee1.salary);
    }
}