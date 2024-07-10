package hw7;

public class Fibonacci {

    public static void fibNumber() {

        int a = 0;   //первое число
        int b = 1;   //второе число
        int n = 10;  //сколько всего будем выводить чисел

        System.out.println("Первые " + n + " чисел из ряда Фибоначчи:");

        for (int i = 0; i < n; i++) { // цикл будет работаеть пока i<10, каждую итерацию увеличиваясь на 1.

            System.out.print(a + " ");

            int nextNumber = a + b;   // вычислить след. число в ряду Ф-и
            a = b;                    // двигаем a на одну позицию вперёд
            b = nextNumber;           // двигаем b на одну позицию вперёд
        }

    }

    public static void main(String[] args) {
        fibNumber();
    }
}

