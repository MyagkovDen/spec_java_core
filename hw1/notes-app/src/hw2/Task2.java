package hw2;

// Написать функцию, возвращающую разницу между самым большим
// и самым маленьким элементами переданного не пустого массива.
public class Task2 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 0, -1, 12, 25, 0, -10};
        System.out.println(getDifferance(arr));
    }

    public static int getDifferance(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }
}
