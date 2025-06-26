package GoodJob.Lesson14_.GoodJob;

public class Test6 {
    public void time() {
        // hour - час
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            // moment - минута
            INNER:
            for (int moment = 0; moment <= 59; moment++) {
                if (moment == 20) {
                    continue OUTER;
                }
                System.out.println(hour + ":" + moment);
            }
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}



