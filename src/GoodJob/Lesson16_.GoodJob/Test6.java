package GoodJob.Lesson16_.GoodJob;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String str1 = new String("privEt:2");
        String s1 = str1.toLowerCase();
        System.out.println("s1=" + s1);

        String s2 = str1.toUpperCase();
        System.out.println("s2=" + s2);

        boolean b = str1.contains("T:2");
        System.out.println("b=" + b);
    }
}
