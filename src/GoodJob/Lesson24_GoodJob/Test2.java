package GoodJob.Lesson24_GoodJob;

public class Test2 {
    public static void main(String[] args) {

}

abstract class Figure {
    int numberOfSides = 0;
    abstract void perimeter();
    abstract void Area();
    void showInfo() {
        System.out.println("Эта фигура ");
    }
}


class Square extends Figure {

}

class rectangle extends Figure {

}

class Circles extends Figure {

}