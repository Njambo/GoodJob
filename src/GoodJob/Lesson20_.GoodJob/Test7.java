package GoodJob.Lesson20_.GoodJob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "B";
        String str3 = "C";
        String str4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(str3);
        list1.add(str1);
        list1.add(str4);
        list1.add(str2);

        ListIterator<String> it = list1.listIterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}