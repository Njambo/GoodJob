package GoodJob.Lesson21_GoodJob;

public class Test2 {
    public static void main(String[] args) {
        String str1, str2;
        str1 = new String("Hi");
        str2 = new String("Bye");
        str1 = str2;
        String str3 = str1;
        str1 = null;
    }
}