package GoodJob.Lesson15_.GoodJob;

public class Test7 {
    public static void main(String[] args) {
        int money = 0;
        do {
            System.out.println("Делайте вставку");
            System.out.println("Вы проиграли");
            money = money - 10;
        }
        while (money > 50);
    }
}
