package GoodJob.Lesson24_GoodJob;

public class Test5 {
}
interface I1 {
    default void abc() {
        System.out.println("Этот интерфейс abc");
    }
    static void def() {
        System.out.println(" static метод 1");
    }
    interface I2 {
        static void def() {
            System.out.println(" static метод 2");
        }
    }
    abstract class R implements I1, I2 {
        public static void main(String[] args) {
            I1.def();
        }
    }
//}
//class Z2 implements I1 {
//    public void abc() {
//        System.out.println("Этот интерфейс abc");
//    }
//
//    public static void main(String[] args) {
//        Z2 z2 = new Z2();
//        z2.abc();
//        z2.def();
//        z2.ghi();
//    }
//    public void ghi() {
//        System.out.println("Этот интерфейс ghi");
//    }
}