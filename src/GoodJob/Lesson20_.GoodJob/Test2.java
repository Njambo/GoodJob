package GoodJob.Lesson20_.GoodJob;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("bye"));
        list1.add(new StringBuilder("hi"));
        list1.add(new StringBuilder("ok"));
        list1.add(new StringBuilder("hello"));
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("list1 - ");
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Ivanov"));

        list1.addAll(list2);
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
        list2.get(1).append("!");
        System.out.println();
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
        list1.clear();
        System.out.println();
        System.out.println();
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
    }
}