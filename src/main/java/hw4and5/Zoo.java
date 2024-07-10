package hw4and5;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Zoo {


    public static void main(String[] args) {


        String line = new String();                           //уточнить про эту историю
        Scanner sc = new Scanner(System.in);
        boolean zooOpen = true;
        boolean showList = false;

        List<Creature> creatures = new ArrayList<>();

        creatures.add(new Lion("Симба", 2, "Мужская особь"));
        creatures.add(new Elephant("Дамбо", 2, "Мужская особь"));
        creatures.add(new Eagle("Орёл", 2, "Женская особь"));
        creatures.add(new Sparrow("Воробей", 2, "Мужская особь"));
        creatures.add(new Shark("Челюсти", 2, "Женская особь"));
        creatures.add(new Vobla("Вобла", 2, "Женская особь"));


        System.out.println("\nДобро пожаловать! Чтобы посмотреть список всех животных введите 'list' или 'quit' для выхода!");


        while (zooOpen) {

            line = sc.nextLine();
            switch (line) {
                case "list":
                    showList = true;
                    System.out.println("Список всех животных:");
                    for (int i = 0; i < creatures.size(); i++) {
                        System.out.println((i + 1) + ". " + creatures.get(i).getName());
                    }
                    break;
                case "quit":
                    zooOpen = false;
                    sc.close();
                    System.out.println("До свидания!");
                    break;
                default:
                    if (showList) {
                        try {
                            int number = Integer.parseInt(line);
                            if (number > 0 && number <= creatures.size()) {
                                Creature creature = creatures.get(number - 1);
                                System.out.println("Имя: " + creature.getName() + ". Возраст: " + creature.getAge() + ". Пол: " + creature.gender);
                                creature.breath();
                                creature.move();
                                creature.makeSound();
                            } else {
                                System.out.println("Неверный номер. Попробуйте снова");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Неверная команда. Пожалуйста введите 'list' или 'quit'.");
                        }

                    } else {
                        System.out.println("Сначала введите 'list', чтобы получить список животных или 'quit' для выхода.");
                    }
                    break;
            }
        }
    }
}
