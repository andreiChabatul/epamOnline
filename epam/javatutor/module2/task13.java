package epam.javatutor.module2;

import java.util.Arrays;

public class task13 {

/*    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

    public static void main(String[] args) {
        int n = 7;
        int[][] mas = new  int[n][n];

        for (int j = 0; j < mas.length; j = j + 2) {
            for (int i = 1; i < mas.length + 1; i++) {
                mas[j][i - 1] = i;
            }
        }

        for (int j = 1; j < mas.length; j = j + 2) {
            for (int i = 0; i < mas.length; i++) {
                mas[j][i] = mas.length - i;
            }
        }


        System.out.println(Arrays.deepToString(mas));


    }
}
