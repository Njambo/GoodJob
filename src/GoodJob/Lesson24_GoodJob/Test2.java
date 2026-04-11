package GoodJob.Lesson24_GoodJob;

public class Test2 {
    public static void main(String[] args) {

    }

    abstract class Figure {
        int numberOfSides = 0;

        abstract void perimeter();

        abstract void area();

        void showInfo() {
            System.out.println("Эта фигура ");
        }
    }


    class Square extends Figure {
        int numberOfSides = 4;
        int side = 10;

        public void perimeter() {
            System.out.println("Периметр квадрата = " + 4 * side);
        }

        public void area() {
            System.out.println("Площадь квадрата = " + side * side);
        }
    }
}

class rectangle extends Figure {
    int numberOfSides = 4;
    int side1 = 8;
    int side2 = 5;

    public void perimeter() {
        System.out.println("Периметр прямоугольника = " + 2 * (side1 + side2));
    }

    public void area() {

    }
}

class Circles extends Figure {

}