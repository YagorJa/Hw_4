import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
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
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}