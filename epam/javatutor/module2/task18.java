package epam.javatutor.module2;

import java.util.Arrays;

public class task18 {

/*    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    Определить, какой столбец содержит максимальную сумму.*/

    public static void main(String[] args) {

        int n = (int) (Math.random() * 10);
        int[][] mas = new int[n][n];
        int summa = 0;
        int maximum = 0;
        int id = 1;

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas.length; i++) {
                mas[j][i] = (int) (Math.random() * 1500);
            }
        }
        System.out.println(Arrays.deepToString(mas));

        for (int[] elem : mas) {
            maximum = maximum + elem[0];
        }

        for (int j = 1; j < mas.length; j++) {
            for (int[] elem : mas) {
                summa = summa + elem[j];
            }
            if (maximum < summa) {
                maximum = summa;
                id = j + 1;
            }
            summa = 0;
        }

        System.out.println("Column № "+id+ " contains the maximum sum, which is: " + maximum);

    }
}