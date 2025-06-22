package GoodJob.Lesson6_GoodJob;
public class Employee {
    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    public Employee(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ivanov", 25);
        System.out.println(employee1.surname);
        System.out.println();
        Employee employee2 = new Employee("Petrov", 30);
        System.out.println(employee2.department);
        System.out.println();
        Employee employee3 = new Employee(2, "Sidorov", 40, 100.35, "IT");
        System.out.println("ID: " + employee3.id + "," + " " + "surname: " + employee3.surname + "," + " " + "age: " + employee3.age + "," + " " + "salary: " + employee3.salary + "," + " " + "department: " + employee3.department);
    }
}
