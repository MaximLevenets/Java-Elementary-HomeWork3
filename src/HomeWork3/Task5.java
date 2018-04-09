package HomeWork3;

import java.util.Random;
/*Написать программу с функциями для просчета среднего арифметичесского массива для различных типов данных*/
public class Task5 {
    public static void main(String[] args) {
        int arrayInt[] = new int[10];
        average_array(arrayInt);

        float arrayFloat[] = new float[10];
        average_array(arrayFloat);

        long arrayLong[] = new long[30];
        average_array(arrayLong);

        double arrayDouble[] = new double[30];
        average_array(arrayDouble);
        }

    public static void average_array(int[]array){
        int sumArray = 0, averageArray = 0;
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length ; i++) {
            array[i] = ((int)(Math.random() * 20));
            sumArray +=array[i];
            averageArray = sumArray / array.length;
            System.out.print(array[i] + "   ");
        }
        System.out.println("\nСреднее арифметичесское массива: " + averageArray + "\n");
    }
    public static void average_array(float[]array){
        float sumArray = 0, averageArray = 0;
        System.out.print("Исходный массив: ");
        for (float i = 0; i < array.length ; i++) {
            array[(int) i] = (float) (Math.random()*20);
            sumArray +=array[(int) i];
            averageArray = sumArray / array.length;
            System.out.print(array[(int) i] + "   ");
        }
        System.out.println("\nСреднее арифметичесское массива: " + averageArray + "\n");
    }

    public static void average_array(long[]array){
        long sumArray = 0, averageArray = 0;
        System.out.print("Исходный массив: ");
        for (float i = 0; i < array.length ; i++) {
            array[(int) i] = (long) (Math.random()*20);
            sumArray +=array[(int) i];
            averageArray = sumArray / array.length;
            System.out.print(array[(int) i] + "   ");
        }
        System.out.println("\nСреднее арифметичесское массива: " + averageArray + "\n");
    }
    public static void average_array(double[]array){
        double sumArray = 0, averageArray = 0;
        System.out.print("Исходный массив: ");
        for (double i = 0; i < array.length ; i++) {
            array[(int) i] = (Math.random()*20);
            sumArray +=array[(int) i];
            averageArray = sumArray / array.length;
            System.out.print(array[(int) i] + "   ");
        }
        System.out.println("\nСреднее арифметичесское массива: " + averageArray + "\n");
    }

}
