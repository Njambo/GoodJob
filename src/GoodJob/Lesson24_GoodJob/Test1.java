package GoodJob.Lesson24_GoodJob;

public class Test1 {
}
class A {
    String s = "hi";
    void abc() {
        System.out.println("???");
    }
}
class B extends A {
    String s = "bye";
    void abc() {
        System.out.println("!!!");
    }
}
class C extends B {
    public static void main(String[] args) {
        C c1 = new C();
        c1.abc();
        System.out.println(c1.s);
    }
}