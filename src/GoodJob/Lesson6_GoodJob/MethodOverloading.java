package GoodJob.Lesson6_GoodJob;
public class MethodOverloading {
    void show(int int1) {
        System.out.println("Тип данных - int");
        System.out.println(int1);
    }

    void show(int a, int b) {
        System.out.println("Тип данных - int");
        System.out.println(a);
    }

    void show(boolean boolean1) {
        System.out.println("Тип данных - boolean");
        System.out.println(boolean1);
    }

    void show(String string1) {
        System.out.println("Тип данных - String");
        System.out.println(string1);
    }

    void show(String s, int a) {
        System.out.println("String : " + s + " " + "int : " + a);
    }

    void show(int a, String s) {
        System.out.println("какой хороший день!!!!!!!!");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        boolean b = true;
        String s = "Hello";
        mO.show(a);
        mO.show(b);
        mO.show(s);
        mO.show("Hi", 10);
        mO.show(10, "p");
    }
}
