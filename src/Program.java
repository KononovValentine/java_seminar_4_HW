import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        startProgram();
    }

    static void startProgram() {
        System.out.println("Введите номер программы (1-4), либо введите \"Q\" для выхода.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа № ");
        String program = scanner.nextLine();
        if (program.equalsIgnoreCase("q")) {
            System.out.println("До свидания!");
        } else if (program.chars().allMatch(Character::isDigit)) {
            switch (program) {
                case "1" -> ex0();
                case "2" -> ex1();
                case "3" -> ex2();
                default -> {
                    System.out.println("Введен некорректный номер, пожалуйста, попробуйте еще раз.");
                    startProgram();
                }
            }
        } else {
            System.out.println("Ввод некорректен, пожалуйста, попробуйте еще раз.");
            startProgram();
        }
    }

    // Задача 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    static void ex0() {
        MyLinkedList list = new MyLinkedList(){};
        list.add("a");
        list.add(1);
        list.add("c");
        list.add(123);
        System.out.println("Изначальный список " + list.print());
        System.out.println("Развернутый список " + list.reverse());
    }

    // Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец
    // очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент
    // из очереди, не удаляя.
    static void ex1() {
        MyLinkedList list = new MyLinkedList(){};
        list.enqueue("a");
        list.enqueue(1);
        list.enqueue("c");
        list.enqueue(123);
        System.out.println("Изначальный список " + list.print());
        System.out.println("Первый элемент " + list.first());
        System.out.println("Последний элемент " + list.last());
        System.out.println("Удаленный элемент " + list.dequeue());
        System.out.println("Итоговый список " + list.print());
    }

    // Задача 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    static void ex2() {
        MyLinkedList list = new MyLinkedList(){};
        list.enqueue(10);
        list.enqueue(1);
        list.enqueue(15);
        list.enqueue(123);
        System.out.println("Изначальный список " + list.print());
        MyClass result = list.getSum();
        System.out.println("Список значений " + Arrays.toString(result.getArray()));
        System.out.println("Сумма значений " + result.getSum());
    }

    // Возможно последнее я немного не так понял и не нужно было создавать дополнительный список, а просто не удалять
    // элементы из текущего... Но уже сделал... Зато сделал свой класс для возврата из функции списка и значения суммы.
    // =)
}
