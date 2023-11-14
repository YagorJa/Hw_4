import java.util.Arrays;
import java.util.Scanner;

public class TaskX {
    public static void main(String[] args) {
        System.out.println("Введите рамзмер массива: ");
        Scanner sc = new Scanner(System.in);
        int razmer = sc.nextInt();
        int[] arr = new int[razmer];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i <arr.length ; i++) {
            Scanner el = new Scanner(System.in);
            int element = el.nextInt();
            arr[i] = element;
        }
        arr[arr.length - 1]++;
        System.out.println("Полученный массив: " + Arrays.toString(arr));
//        int result = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            int temp = result;
//            result = arr[arr.length - i - 1];
//            result++;
//            break;
//        }
//        System.out.println(result);
    }
}
