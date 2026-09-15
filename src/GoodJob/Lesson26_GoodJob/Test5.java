package GoodJob.Lesson26_GoodJob;

public class Test5 {
    {
        System.out.println("Это init блок 3");
    }
    Test5() {
        System.out.println("Это конструктор");
    }
    Test5(int a) {
        this();
        System.out.println("Это конструктор 2");
    }

    {
        System.out.println("Это init блок 1");
    }

    {
        System.out.println("Это init блок 2");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5();
    }
}
