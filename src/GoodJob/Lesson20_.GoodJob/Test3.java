package GoodJob.Lesson20_.GoodJob;
import java.util.ArrayList;
import java.util.List;
public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("hi");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();
        list.remove(sb1);
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
    }
}
