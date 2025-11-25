package GoodJob.Lesson24_GoodJob;

public class Test4 {
    public static void main(String[] args) {
        Jump_able j1 = new Human();
        Jump_able j2 = new Animal();
    }
}
class Human implements Jump_able {
    public void jump() {
        System.out.println("Human jump");
    }
}
class Animal implements Jump_able {
    public void jump() {
        System.out.println("Animal jump");
    }
}
// интерфейс прыгать
interface Jump_able {
void jump();
}
interface A2 {
    void abc();
}
interface B2 extends A2, Jump_able {
    void def();
}
abstract class D implements B2 {

}