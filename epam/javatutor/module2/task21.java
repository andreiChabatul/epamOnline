package epam.javatutor.module2;

import java.util.Arrays;

public class task21 {

/*    Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

    public static void main(String[] args) {

        int n = (int) (Math.random() * 5);
        int[][] mas = new int[n][n];
        int [] value = new int [n];

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas.length; i++) {
                mas[j][i] = (int) (Math.random() * 1500);
            }
        }
        System.out.println(Arrays.deepToString(mas));

        for (int[] elem : mas) {
            for (int i = 0; i < mas.length; i++) {
                Arrays.sort(elem);
            }
        }
        System.out.println("Rows sorted in ascending order: ");
        System.out.println(Arrays.deepToString(mas));

        for (int[] elem : mas) {
            for (int i = 0; i < mas.length; i++) {
                value[mas.length - 1 - i] = elem[i];
            }
            System.arraycopy(value, 0, elem, 0, mas.length);
        }

        System.out.println("Rows sorted in descending order: ");
        System.out.println(Arrays.deepToString(mas));
    }
}