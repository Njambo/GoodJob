package GoodJob.Lesson22_GoodJob.p1;

import GoodJob.Lesson22_GoodJob.Person;

public class Test1 {
    public static void main(String[] args) {
        Person p = new Person("Man");
        p.setName(new StringBuilder("Nikita"));
        p.setAge(17);
        p.setWeight(36);
        System.out.println("Имя: " + p.getName());
        System.out.println("Возраст: " + p.getAge());
        System.out.println("Вес: " + p.getWeight());
    }
}
