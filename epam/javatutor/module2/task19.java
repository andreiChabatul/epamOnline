package epam.javatutor.module2;

import java.util.Arrays;

public class task19 {

/*    Найти положительные элементы главной диагонали квадратной матрицы.*/

    public static void main(String[] args) {

        int n = (int) (Math.random() * 10);
        int[][] mas = new int[n][n];
        int a = 0;

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas.length; i++) {
                mas[j][i] = -500 + (int) (Math.random() * 1000);
            }
        }
        System.out.println(Arrays.deepToString(mas));

        for (int[] elem : mas) {
            if (elem[a] > 0) {
                System.out.print(elem[a] + " ");
            }
            a++;
        }

    }
}