package HomeWork3;
import java.util.Scanner;
/*Составить функцию, которая определяет, верно ли, что в заданом числе все цифре стоят по возрастанию*/
public class Task4_v1 {
    public static void main(String[] args) {
        testOfIncrease();
    }

    public static void testOfIncrease() {
        final int min = 0, max = 999;
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Введите число: ");
            number = sc.nextInt();
        } while (number <= min || number > max);
        if (number > min && number <= max) {
            String num = String.valueOf(number);
            char result[] = num.toCharArray();
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    System.out.println("В заданом числе цифры стоят НЕ по возрастанию");
                    break;
                } else if (result[i] < result[i + 1] && result[i + 1] > result[i + 2]) {
                    System.out.println("В заданом числе цифры стоят по возрастанию");
                    break;
                } else if (result[i] == result[i + 1]) {
                    System.out.println("В заданом числе есть повторяющиеся цифры");
                    break;
                }
            }
        }
    }
}
