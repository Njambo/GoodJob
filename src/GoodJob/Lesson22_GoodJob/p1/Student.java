package GoodJob.Lesson22_GoodJob.p1;

import GoodJob.Lesson22_GoodJob.*;

public class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s.work();
    }
}
class Test {
    public static void main(String[] args) {
        Student s = new Student();
//        System.out.println(s.name);
//        s.work();
    }
}