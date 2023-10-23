package hw2;

// Написать функцию, возвращающую истину,
// если в переданном массиве есть два соседних элемента, с нулевым значением.
public class Task3 {
    public static void main(String[] args) {
        int [] arr = new int [] {0, 0, 0, 1, 0, 1};
        System.out.println(containsSucceededZeros(arr));

    }

    public static boolean containsSucceededZeros(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
