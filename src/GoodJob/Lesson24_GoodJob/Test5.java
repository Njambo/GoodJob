package GoodJob.Lesson24_GoodJob;

public class Test5 {
}
interface I1 {
    default void abc() {
        System.out.println("это метод abc");
    }
}
interface I2 extends I1 {
    void abc();
}
 class R implements I1 {
    public void abc() {
        System.out.println("это метод abc");
    }
}






//class Z2 implements I1 {
//    public void abc() {
//        System.out.println("это метод abc");
//    }
//
//    public static void main(String[] args) {
//        Z2 z = new Z2();
//        z.abc();
//        z.def();
//        z.ghi();
//    }
//    public void ghi() {
//        System.out.println("это метод ghi");
//    }
//}