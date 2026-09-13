package GoodJob.Lesson26_GoodJob;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
        //System.out.println(a);

        String s1 = "50";
        String s2 = "OfTrue";
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        double d = Double.parseDouble(s3);
        System.out.println(i1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
