package GoodJob.Lesson11_GoodJob;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // increase - увеличение
    public double increase(double a) {
        a = a * 2;
        return a;
    }
    // the_salary_of_the_workers - зарплата рабочива
    public double the_salary_of_the_workers() {
        salary = salary * 2;
        return salary;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nikita", 200.55);
        double d = employee1.increase(employee1.salary);
        System.out.println(d);
        System.out.println(employee1.salary);
        employee1.the_salary_of_the_workers();
        System.out.println(employee1.salary);
    }
}