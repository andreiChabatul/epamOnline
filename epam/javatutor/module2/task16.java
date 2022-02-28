package epam.javatutor.module2;

import java.util.Arrays;

public class task16 {

/*    Сформировать квадратную матрицу порядка N по правилу   */

    public static void main(String[] args) {

        int n = 4;
        double [][] mas = new double [n][n];
        double N;
        N = n;

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas.length; i++) {
                mas[j][i] = Math.sin(((i * i) - (j * j)) / N);
            }
        }

        System.out.println(Arrays.deepToString(mas));

    }
}