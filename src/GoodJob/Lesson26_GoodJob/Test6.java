package GoodJob.Lesson26_GoodJob;

public class Test6 {
    int a = 3;
    Test6() {
        a = 4;
    }
    {
        a = 5;
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}
class A {
    static final int b;
    int a = 5;
    static {
        b = 10;
    }
}
class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;
    static {
        c = 5;
        d = 3;
        e = 2;
        f = 0;
    }
}
class C {
    String s = "ok";

}