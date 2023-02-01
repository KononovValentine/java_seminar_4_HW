public class MyClass {
    private int[] array;
    private int sum;

    MyClass(int[] array, int sum) {
        this.array = array;
        this.sum = sum;
    }

    // Возвращает список
    int[] getArray() {
        return array;
    }

    // Возвращает сумму
    int getSum() {
        return sum;
    }
}
