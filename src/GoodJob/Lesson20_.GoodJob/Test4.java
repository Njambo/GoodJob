package GoodJob.Lesson20_.GoodJob;
import java.util.ArrayList;
public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        StringBuilder sb = new StringBuilder("bye");
        list1.add(sb);
        list1.add(new StringBuilder("hi"));
        list1.add(new StringBuilder("ok"));
        list1.add(new StringBuilder("hello"));
        System.out.println(list1.toString());
    }
}
