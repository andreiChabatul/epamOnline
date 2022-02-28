package epam.javatutor.module2;

import java.util.Arrays;

public class task15 {

/*    . Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

    public static void main(String[] args) {

        int n = 8;
        int[][] mas = new int[n][n];
        int a = 0;

        for (int j = 0; j < (mas.length / 2); j++) {
            for (int i = a; i < n; i++) {
                mas[j][i] = 1;
            }
            n --;
            a ++;
        }
        a = 0;

        for (int j = 0; j < mas.length/2; j++) {
            System.arraycopy(mas[mas.length / 2 - 1 - a], 0, mas[mas.length / 2 + a], 0, mas.length);
            a ++;
        }

        System.out.println(Arrays.deepToString(mas));
    }
}