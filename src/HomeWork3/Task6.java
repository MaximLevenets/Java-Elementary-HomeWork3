package HomeWork3;
/*Написать программу с функциями для просчета суммы квадратов двух чисел для различных типов данных*/
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Сумма квадратов чисел " + sumOfSquare(5.5526F,5.46F));
        System.out.println("Сумма квадратов чисел " + sumOfSquare(5,5));
        System.out.println("Сумма квадратов чисел " + sumOfSquare(2354L,32646L));
        System.out.println("Сумма квадратов чисел " + sumOfSquare(5.2D,3.05));

    }
    public static int sumOfSquare(int a, int b){
        return a*a+b*b;
    }
    public static float sumOfSquare(float a, float b){
        return a*a+b*b;
    }
    public static double sumOfSquare(double a, double b){
        return a*a+b*b;
    }
    public static long sumOfSquare(long a, long b){
        return a*a+b*b;
    }
}
