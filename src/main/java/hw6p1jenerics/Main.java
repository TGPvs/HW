package hw6p1jenerics;

public class Main {
    public static void main(String[] args) {
        Cup<Water> waterCup = new Cup<>(new Water());
        Cup<Cola> colaCup = new Cup<>(new Cola());
        Cup<Oil> oilCup = new Cup<>(new Oil());

        waterCup.fill(new Water());
        waterCup.pour();
        waterCup.pour();

        colaCup.fill(new Cola());
        colaCup.pour();
        colaCup.pour();

        oilCup.fill(new Oil());
        oilCup.pour();
        oilCup.pour();

    }
}