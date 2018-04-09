package HomeWork3;

import java.util.Random;

/*Заполнить массив из 10 элементов случайными НЕ повторяющимися числами*/
public class Task7 {
    public static void main(String[] args) {
        randomArray();
    }

    public static void randomArray() {
        int i, j, arraySize = 10, randomSize = 11;
        Random newRandom = new Random();
        int[] array1 = new int[arraySize];

        for (i = 0; i < array1.length; ) {
            int randomNumber = newRandom.nextInt(randomSize);

            for (j = 0; j < i; j++) {
                if (array1[j] == randomNumber) {
                    break;
                }
            }
            if (j == i) {
                array1[i] = randomNumber;
                System.out.print(array1[i] + " ");
                i++;
            }
        }
    }
}


