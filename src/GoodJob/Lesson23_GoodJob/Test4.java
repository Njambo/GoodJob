package GoodJob.Lesson23_GoodJob;

public class Test4 {
    void abc(Animal a) {
        System.out.println("A");
    }
    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 test = new Test4();
        Animal an = new Mouse();
        an.getName();
    }
}
class Animal {
    void getName() {
        System.out.println("Animal");
    }
}
class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}
