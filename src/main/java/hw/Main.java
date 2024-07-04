package hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxCnt = 5;
        int remainCnt = maxCnt - 1;
        String scan = new String();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Подтвердите, что вы не робот. Сколько будет 371-65?");
            scan = sc.nextLine();
            if (scan.equals("306")) {
                System.out.println("Ответ верный, можете продолжить регистрацию!");
                break;
            } else {
                System.out.println(String.format("Вы ввели %s", scan + ". Это неверный ответ! Количество оставшихся попыток: " + remainCnt--));
            }
            if (remainCnt < 0) {
                for (; ; ) {
                    System.out.println("Вы израсходовали все попытки! Возможность регистрации заблокирована!");
                }
            }
        }

    }
}



