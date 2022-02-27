package epam.javatutor.module2;

import java.util.Arrays;

public class task12 {

/*    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/

    public static void main(String[] args) {

        int n = 2 + (int) ( Math.random() * 10 );
        int[][] mas = new  int[n][n];

        for (int j = 0; j < mas[0].length; j++) {
            for (int i = 0; i < mas.length; i++) {
                mas[i][j] = -100 + (int) (Math.random() * 1000);
            }
        }
        System.out.println(Arrays.deepToString(mas));

            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[j][j] + " ");
            }
    }
}