import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] arr = new int[numbers];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Полученный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
