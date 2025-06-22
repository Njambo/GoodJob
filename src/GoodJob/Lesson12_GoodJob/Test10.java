package GoodJob.Lesson12_GoodJob;

public class Test10 {
    void abc() {
        String str;
        int a = 5;
        if (a >= 10) {
            str = "Привет";
        }
        if (a < 10) {
            str = "Пока";
        } else {
            str = null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int maximum = (a > b) ? a : b;
        System.out.println(maximum);
    }
}