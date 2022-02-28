package epam.javatutor.module2;

import java.util.Arrays;

public class task20 {

 /*   Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз.*/

    public static void main(String[] args) {

        int[][] mas = new int[10][20];
        int quntily = 0;

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas[0].length; i++) {
                mas[j][i] = (int) (Math.random() * 15);
            }
        }
        System.out.println(Arrays.deepToString(mas));

        for (int j = 0; j < mas.length; j++) {
            for (int i = 0; i < mas[0].length; i++) {
                if (mas[j][i] == 5) {
                    quntily++;
                }
            }
            if (quntily > 2) {
                System.out.println("Number 5 occurs three or more times in line №: " + j);
            }
            quntily = 0;
        }
    }
}