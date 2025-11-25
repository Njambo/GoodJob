package GoodJob.Lesson24_GoodJob;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }
}

// класс Фигура
abstract class Figura {

    // количество сторон
    int kolichestvoStoron = 0;

    // периметр
    abstract void perimetr();

    // площадь
    abstract void ploshad();

    void showInfo() {
        System.out.println("Эта фигура");
    }

}

// класс квадрат
class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    // сторона
    int storona1 = 10;

    public void perimetr() {
        System.out.println("периметр квадрата = " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("площадь квадрата = " + storona1 * storona1);
    }
}

// класс прямоугольник
class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("периметр прямоугольника = " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("площадь прямоугольника = " + storona1 * storona2);
    }
}

// класс окружность
class Okrujmost extends Figura {
    int kolichestvoStoron = 0;

    // радиус
    int radius = 3;

    public void perimetr() {
        System.out.println("периметр окружности = " + 2 * 3.14 * radius);
    }
    public void ploshad() {
        System.out.println("площадь окружности = " + 3.14 * radius * radius);
    }
}
// класс четырёхугольник
abstract class Chetirexugolnik extends Figura {
    void def() {
        System.out.println("это четырёхугольник");
    }
}