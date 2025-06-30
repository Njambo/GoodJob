package GoodJob.Lesson16_.GoodJob;

public class Test9 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 != s4);

        String s5 = "Как Дела?";
        String s6 = "как дела?";
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}
