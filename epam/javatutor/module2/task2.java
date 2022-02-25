package epam.javatutor.module2;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

/*    Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.*/


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 2 + (int) ( Math.random() * 100 );
        double[] mas = new double[n];
        int quantly = 0;
        double k;

        for (int i = 0; i < mas.length; i++) {
            mas [i] = -500 + Math.random() * 1000;
        }

        System.out.println(Arrays.toString(mas));

        System.out.print("Enter number K: ");
        k = in.nextDouble();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i]<k) {
                mas[i] = k;
                quantly ++;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("The number of substitutions was: " + quantly);

    }
}