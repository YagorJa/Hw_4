import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите рамзмер массива: ");
        Scanner sc = new Scanner(System.in);
        int razmer = sc.nextInt();
        int[] arr = new int[razmer];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            Scanner el = new Scanner(System.in);
            int element = el.nextInt();
            arr[i] = element;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Нулеых элементов нет!");
        } else
                System.out.println("Количество нулевых элементов: " + counter);
    }
}
