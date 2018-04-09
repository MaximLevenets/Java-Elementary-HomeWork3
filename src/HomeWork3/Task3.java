package HomeWork3;

import java.util.Scanner;

/*Составить функцию, которая определяет наибольший общий делитель двух натуральных чисел
* и привести пример её использования*/
public class Task3 {
    public static void main(String[] args) {
        NOD();
    }

    public static void NOD(){
        int a, b, atemp = 0, btemp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        a = sc.nextInt();
        b = sc.nextInt();
        atemp = a;
        btemp = b;
        while (atemp != btemp){
            if (atemp > btemp){
                atemp = atemp - btemp;
            }
            else{
                btemp= btemp - atemp;
            }
        }
        System.out.println("НОД(" + a + "," + b + ") = " + atemp + " ");
    }
}

