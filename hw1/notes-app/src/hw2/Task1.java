package hw2;

//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2};
        System.out.println(countEvens(arr));

    }


    public static int countEvens(int[] array) {
        int count = 0;
        for (int n : array
        ) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
