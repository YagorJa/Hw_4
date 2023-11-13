import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] arr = new int[numbers];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Полученный массив: " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int j = 0; j < arr.length ; j++) {
            if (arr[j] < min) {
                 min = arr[j];
            }
            if (arr[j]> max){
                 max = arr[j];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
