package GoodJob.Lesson5_GoodJob;
public class test20 {
    int summa(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    int arithmeticMean(int a, int b, int c) {
        int result2 = summa(a, b, c) / 3;
        return result2;
    }
}

class test21 {
    public static void main(String[] args) {
        test20 t = new test20();
        int summaTreeChisel = t.summa(1, 2, 3);
        System.out.println("summaTreeChisel: " + summaTreeChisel);
        System.out.println("summaTreeChisel: " + t.summa(5, 10, 15));
        System.out.println("arithmeticMean: " + t.arithmeticMean(20, 40, 60));
    }
}
