package GoodJob.Lesson15_.GoodJob;

public class Test9 {
    public static void main(String[] args) {
        int hour = -1;
        OUTER:
        do {
            hour++;
            int minute = 0;
            INNER:
            while (minute < 60) {
                if (minute == 20) {
                    break OUTER;
                }
                System.out.println(hour + ":" + minute);
                minute++;
            }

        }
        while (hour < 24);
    }
}
