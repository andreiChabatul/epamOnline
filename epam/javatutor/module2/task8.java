package epam.javatutor.module2;

import java.util.Arrays;

public class task8 {

/*    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
            Если таких чисел несколько, то определить наименьшее из них.*/

    public static void main(String[] args) {

        int n = 2 + (int) (Math.random() * 50);
        int[] numbers = new int[n];
        int[] quantityNumber = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ( Math.random() * 20 );
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int number : numbers) {
                if (numbers[i] == number) {
                    quantityNumber[i]++;
                }
            }
        }

        int valResult = numbers[0];
        int popResult = quantityNumber[0];

        for (int i = 0; i < quantityNumber.length; i++) {
            if (popResult < quantityNumber[i]){
                popResult = quantityNumber [i];
                valResult = numbers [i];
            }
            if (popResult == quantityNumber[i] && numbers[i] < valResult){
                valResult = numbers [i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("The smallest number that occurs a large number of times: " + valResult + " "+ "it occurs: " + popResult);

    }
    }