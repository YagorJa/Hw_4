import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] arr = new int[numbers];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Полученный массив: " + Arrays.toString(arr));
        int maxIndex = 0;
        int minIndex = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;

            }
            if (arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
        }
        System.out.println("Индекс минимальнного элемента: " + minIndex);
        System.out.print("Индекс максимального элемента: " + maxIndex);
    }
}
