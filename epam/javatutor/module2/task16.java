package epam.javatutor.module2;

import java.util.Arrays;

public class task16 {

/*    Сформировать квадратную матрицу порядка N по правилу
и подсчитать количество положительных элементов в ней   */

    public static void main(String[] args) {

        int n = 4;
        double [][] mas = new double [n][n];
        double N;
        N = n;
        int quantity = 0;

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas.length; i++) {
                mas[j][i] = Math.sin(((i * i) - (j * j)) / N);
            }
        }

        for (double[] elem : mas) {
            for (int i = 0; i < mas.length; i++) {
                if (elem[i] > 0) {
                    quantity++;
                }
            }
        }

        System.out.println(Arrays.deepToString(mas));
        System.out.println("The number of positive elements in the array: " + quantity);

    }
}