package HomeWork3;

import java.util.Scanner;

/*Составить функцию, которая определяет, верно ли, что в заданом числе все цифре стоят по возрастанию*/
public class Task4_v2 {
    public static void main(String[] args) {
        testOfIncrease();
    }

    public static void testOfIncrease() {

        final int min = 0, max = 999;
        int number, temp1, temp2, temp3;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Введите трехзначное число: ");
            number = sc.nextInt();
        } while (number <= min || number > max);
        if (number > min && number <= max) {
            temp1 = number % 10;
            number /= 10;
            temp2 = number % 10;
            number /= 10;
            temp3 = number % 10;
            if (temp1 > temp2 && temp2 > temp3) {
                System.out.println("В заданом числе цифры стоят по возрастанию");
            } else if (temp1 == temp2 && temp2 == temp3) {
                System.out.println("В заданом числе цифры равны");
            } else System.out.println("В заданом числе цифры стоят НЕ по возрастанию");
        }
    }
}


