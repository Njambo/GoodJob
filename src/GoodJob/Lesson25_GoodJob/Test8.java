package GoodJob.Lesson25_GoodJob;

public class Test8 implements interface1, interface2 {
    public void abc() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        System.out.println(((interface1)t).a);
        t.abc();
    }
}

interface interface1 {
    int a = 5;
    void  abc();
}
interface interface2 {
    int a = 10;
    void abc();
}