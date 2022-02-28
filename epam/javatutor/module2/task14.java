package epam.javatutor.module2;

import java.util.Arrays;

public class task14 {

/*    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

    public static void main(String[] args) {

        int n = 6;
        int[][] mas = new int[n][n];
        int a = 1;

        for (int j = 0; j < mas.length; j++) {
        for (int i = 0; i < n; i++) {
            mas[j][i] = a;
        }
        n --;
        a ++;
    }
        System.out.println(Arrays.deepToString(mas));
    }
}