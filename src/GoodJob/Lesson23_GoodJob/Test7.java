package GoodJob.Lesson23_GoodJob;

public class Test7 {
    public static void main(String[] args) {
        A c1 = new C();
        c1.abc(new B());
    }
}

class A {
    void abc(A a1) {
        System.out.println("A");
    }
}

class B extends A {
    void abc(A a1) {
        System.out.println("BBB");
    }
}
class C extends B {
    void abc(B b2) {
        System.out.println("B");
    }
}