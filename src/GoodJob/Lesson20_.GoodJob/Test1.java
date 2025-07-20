package GoodJob.Lesson20_.GoodJob;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Hi");
        Car car = new Car();
        list1.add(car);
        Student st = new Student();
        list1.add(st);
        list1.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList<>(30);
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5);
        list2.add("bye");
        List<StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("ok"));
    }
}

class Car {

}

class Student {

}
