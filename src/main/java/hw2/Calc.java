package hw2;

public class Calc {

    public int calculate(int... a) {

        int result = 0;
        for (int i : a) {
            result += i; // фор ич же идет по всем индексам массива
        }
        return result;
    }


}