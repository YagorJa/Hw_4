import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] arr = new int[numbers];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Полученный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] < arr[i+1]) {
                System.out.println("четко");
                break;
            }else System.out.println("нечетко");
            break;
        }
    }
}
