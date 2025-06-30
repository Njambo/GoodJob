package GoodJob.Lesson16_.GoodJob;

public class Test2 {
    public static void main(String[] args) {
        String str1 = new String("privet");
//        String s1 = str1.substring(3);
//        System.out.println("s1=" + s1);
//        System.out.println("str1=" + str1);
//
//        String s2 = str1.substring(3, 7);
//        System.out.println("s2=" + s2);
//
//        String s3 = str1.trim();
//        System.out.println("s3" + s3);
//
//        String s4 = str1.substring(3, 26);
//        System.out.println("s4=" + s4);

        String s5 = str1.replace('r', 'Z');
        System.out.println("s5=" + s5);

        String s6 = "privet, ";
        String s7 = "drug";
        System.out.println(s6.concat(s7));
    }
}
