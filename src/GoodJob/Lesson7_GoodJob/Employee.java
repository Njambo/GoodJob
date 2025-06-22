package GoodJob.Lesson7_GoodJob;
public class Employee {
    public double salary;

    // doubleSalary - двойная зарплата
    public void doubleSalary() {
        double result = salary * 2;
        System.out.println("новая зарплата: " + result);
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(500);
        System.out.println("employee1");
        System.out.println(employee1.salary);
        employee1.doubleSalary();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee2 = new Employee(500);
        System.out.println("employee2");
        System.out.println(employee2.salary);
        employee2.doubleSalary();
    }
}