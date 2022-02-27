package epam.javatutor.module2;

import java.util.Arrays;

public class task11 {

    /*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/

    public static void main(String[] args) {
        int n = 2 + (int) ( Math.random() * 10 );
        int[][] mas = new  int[n][n];

        for (int j = 0; j < mas[0].length; j++) {
            for (int i = 0; i < mas.length; i++) {
                mas[i][j] = -100 + (int) (Math.random() * 1000);
            }
        }
        System.out.println(Arrays.deepToString(mas));


        for (int i = 0; i < mas.length; i = i +2) {
            for (int[] elem : mas) {
                if (mas[0][i] > mas[mas.length - 1][i]) {
                    System.out.print(elem[i]);
                    System.out.print(" ");
                }
            }
            System.out.println("   ");
        }
    }
}