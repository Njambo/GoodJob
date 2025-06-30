package GoodJob.Lesson16_.GoodJob;

public class Test1 {
    public static void main(String[] args) {
        String str1 = new String("abcdefghijklmnopqrstuvwxyz");
        int a = str1.length();
        System.out.println("a=" + a);

        char b = str1.charAt(3);
        System.out.println("b=" + b);

        int c = str1.indexOf('t');
        System.out.println("c=" + c);

        int d = str1.indexOf("vet");
        System.out.println("d=" + d);

        int e = str1.indexOf("Z");
        System.out.println("e=" + e);

        int f = str1.indexOf("a", 5);
        System.out.println("f=" + f);

        boolean g = str1.startsWith("abc");
        System.out.println("g=" + g);

        boolean h = str1.endsWith("yz");
        System.out.println("h=" + h);
    }
}