import java.security.KeyPair;
import java.util.*;

public class MyLinkedList {
    private LinkedList<Object> list;
    private int size;

    MyLinkedList() {
        list = new LinkedList();
    }

    // Возвращает текущий размер списка
    int size() {
        return size;
    }

    // Добавляет в список элемент
    void add(Object element) {
        list.add(element);
        size++;
    }

    // Удаляет из списка элемент по индексу
    void remove(int index) {
        list.remove(index);
        size--;
    }

    // Удаляет из списка элемент по самому элементу
    void remove(Object element) {
        list.remove(element);
        size--;
    }

    // Возвращает пустой ли список
    boolean empty(){
        return size == 0;
    }


    // Возвращает элемент по индесу
    Object showElement(int index) {
        return list.get(index);
    }

    // Возвращает последний эелемент
    Object last() {
        return list.getLast();
    }

    // Возвращает первый элемент
    Object first() {
        return list.getFirst();
    }

    // Добавляет в список элемент (аналогично add, но если требуется такое название в задании =) )
    void enqueue(Object element) {
        add(element);
    }

    // Возвращает первый элемент списка, а затем удаляет его
    Object dequeue() {
        Object element = list.getFirst();
        remove(element);
        return element;
    }

    // Возвращает список перевернутым
    LinkedList<Object> reverse()
    {
        LinkedList<Object> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    // Возвращает список для печати
    LinkedList<Object> print() {
        return list;
    }

    // Возвращает список всех чисел и сумму элементов
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
