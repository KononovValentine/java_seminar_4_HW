import java.security.KeyPair;
import java.util.*;

public class MyLinkedList {
    private LinkedList<Object> list;
    private int size;

    MyLinkedList() {
        list = new LinkedList();
    }

    // ���������� ������� ������ ������
    int size() {
        return size;
    }

    // ��������� � ������ �������
    void add(Object element) {
        list.add(element);
        size++;
    }

    // ������� �� ������ ������� �� �������
    void remove(int index) {
        list.remove(index);
        size--;
    }

    // ������� �� ������ ������� �� ������ ��������
    void remove(Object element) {
        list.remove(element);
        size--;
    }

    // ���������� ������ �� ������
    boolean empty(){
        return size == 0;
    }


    // ���������� ������� �� ������
    Object showElement(int index) {
        return list.get(index);
    }

    // ���������� ��������� ��������
    Object last() {
        return list.getLast();
    }

    // ���������� ������ �������
    Object first() {
        return list.getFirst();
    }

    // ��������� � ������ ������� (���������� add, �� ���� ��������� ����� �������� � ������� =) )
    void enqueue(Object element) {
        add(element);
    }

    // ���������� ������ ������� ������, � ����� ������� ���
    Object dequeue() {
        Object element = list.getFirst();
        remove(element);
        return element;
    }

    // ���������� ������ ������������
    LinkedList<Object> reverse()
    {
        LinkedList<Object> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    // ���������� ������ ��� ������
    LinkedList<Object> print() {
        return list;
    }

    // ���������� ������ ���� ����� � ����� ���������
    MyClass getSum() {
        int[] array = new int[list.size()];
        int index = 0;
        int sum = 0;
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            int number = (Integer) iterator.next();
            array[index] = number;
            sum = sum + number;
            index++;
        }
        MyClass result = new MyClass(array, sum);
        return result;
    }
}
