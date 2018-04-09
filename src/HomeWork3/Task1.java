package HomeWork3;

import java.util.Scanner;

/*Составить функцию, которая определяет сумму всех чисел от 1 до N
* и привести пример ее использования*/
public class Task1 {
    public static void main(String[] args) {
        sumOfNumbers();
    }

    public static void sumOfNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        for (int i = 1; i <= temp; i++) {
        sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
    }
}
