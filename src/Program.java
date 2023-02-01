import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("������������!");
        startProgram();
    }

    static void startProgram() {
        System.out.println("������� ����� ��������� (1-4), ���� ������� \"Q\" ��� ������.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("��������� � ");
        String program = scanner.nextLine();
        if (program.equalsIgnoreCase("q")) {
            System.out.println("�� ��������!");
        } else if (program.chars().allMatch(Character::isDigit)) {
            switch (program) {
                case "1" -> ex0();
                case "2" -> ex1();
                case "3" -> ex2();
                default -> {
                    System.out.println("������ ������������ �����, ����������, ���������� ��� ���.");
                    startProgram();
                }
            }
        } else {
            System.out.println("���� �����������, ����������, ���������� ��� ���.");
            startProgram();
        }
    }

    // ������ 1. ����� ��� LinkedList � ����������� ����������. ���������� �����, ������� ������ ������������� ������.
    static void ex0() {
        MyLinkedList list = new MyLinkedList(){};
        list.add("a");
        list.add(1);
        list.add("c");
        list.add(123);
        System.out.println("����������� ������ " + list.print());
        System.out.println("����������� ������ " + list.reverse());
    }

    // ������ 2. ���������� ������� � ������� LinkedList �� ���������� ��������:enqueue() - �������� ������� � �����
    // �������, dequeue() - ���������� ������ ������� �� ������� � ������� ���, first() - ���������� ������ �������
    // �� �������, �� ������.
    static void ex1() {
        MyLinkedList list = new MyLinkedList(){};
        list.enqueue("a");
        list.enqueue(1);
        list.enqueue("c");
        list.enqueue(123);
        System.out.println("����������� ������ " + list.print());
        System.out.println("������ ������� " + list.first());
        System.out.println("��������� ������� " + list.last());
        System.out.println("��������� ������� " + list.dequeue());
        System.out.println("�������� ������ " + list.print());
    }

    // ������ 3. ������� ����� ���� ��������� LinkedList, �������� ��� �������� � ������. ����������� ��������
    static void ex2() {
        MyLinkedList list = new MyLinkedList(){};
        list.enqueue(10);
        list.enqueue(1);
        list.enqueue(15);
        list.enqueue(123);
        System.out.println("����������� ������ " + list.print());
        MyClass result = list.getSum();
        System.out.println("������ �������� " + Arrays.toString(result.getArray()));
        System.out.println("����� �������� " + result.getSum());
    }

    // �������� ��������� � ������� �� ��� ����� � �� ����� ���� ��������� �������������� ������, � ������ �� �������
    // �������� �� ��������... �� ��� ������... ���� ������ ���� ����� ��� �������� �� ������� ������ � �������� �����.
    // =)
}
