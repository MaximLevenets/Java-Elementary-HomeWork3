package HomeWork3;
import java.util.Scanner;
/*Составить функцию, которая спросит число и степень в которую необходимо возвести число*/
public class Task2 {
    public static void main(String[] args) {
        degreeOfNumder();
    }
    public static void degreeOfNumder(){
        Scanner sc = new Scanner(System.in);
        int number, degree, degreeOfNumber;
        System.out.print("Введите число:  ");
        number = sc.nextInt();
        System.out.print("Введите степень:  ");
        degree = sc.nextInt();
        degreeOfNumber = (int) Math.pow(number, degree);
        System.out.print("Результат равен: " + degreeOfNumber   );
    }
}
