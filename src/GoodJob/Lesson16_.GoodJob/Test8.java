package GoodJob.Lesson16_.GoodJob;

public class Test8 {
    public static void main(String[] args) {
        String s1 = "Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала: Ты Лучше голодай, чем что попало есть, И лучше будь один, чем вместе с кем попало.";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for (int a = 0; a < s1.length(); a++) {
            c1 = s1.charAt(a);
            c2 = s2.charAt(a);
            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
