package GoodJob.Lesson3_GoodJob;

public class test7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int  c = 99;
        int d = 100;
        boolean f = a < b | ++c == d; // true || true = true
        System.out.println("f: " + f);
        System.out.println("c: " + c);
        int x = 10;
        int y = 5;
        int i = x | y;
        System.out.println("i: " +i);
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean j = b1^b2^b3^b4;
        System.out.println("j: " + j);
    }
}
