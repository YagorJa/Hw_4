import java.util.Arrays;
import java.util.Scanner;

public class TaskX {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int razmer = sc.nextInt();
        int[] arr = new int[razmer];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i]++;
            if (arr[i] == 10 && i == 0) {
                arr = new int[arr.length + 1];
                arr[0] = 1;
            } else if (arr[i] == 10) {
                arr[i] = 0;
            } else {
                break;
            }
        }
        System.out.println("Полученный массив: " + Arrays.toString(arr));
    }
}

