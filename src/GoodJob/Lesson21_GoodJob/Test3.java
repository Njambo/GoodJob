package GoodJob.Lesson21_GoodJob;

public class Test3 {
    Test3() {
        System.out.println("Это конструктор");
    }

    void Test3() {
        System.out.println("Это метод");
    }
    Test3 Test3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}