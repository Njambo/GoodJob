package GoodJob.Lesson13_GoodJob;

public class Lesson13_Employee {
    public static void main(String[] args) {
        switch ("вторник") {
            case "понедельник":

            case "вторник":

            case "среда":

            case "четверг":

            case "пятница":
                System.out.println("работа до 18.00");
                break;
            case "суббота":
                System.out.println("работа до 14.00");
                break;
            case "воскресенье":
                System.out.println("работы нет");
                break;
            default:
                System.out.println("такого дня не существует");
        }
    }
}