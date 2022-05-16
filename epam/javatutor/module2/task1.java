package epam.javatutor.module2;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {

    /*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 2 + (int) ( Math.random() * 500 );
        int[] mas = new int[n];
        int k;
        int summa = 0;

        for (int i = 0; i < mas.length; i++) {
            mas [i] = (int) ( Math.random() * 50000 );
        }

        System.out.println(Arrays.toString(mas));

        System.out.print("Enter number K: ");
        k = in.nextInt();

        if (k == 0){
            System.out.println("Number cannot be zero.");
        }
        else{
            for (int ma : mas) {
                if (ma % k == 0) {
                    summa = summa + ma;
                }
            }
            System.out.println("Sum of multiples of 5: " + summa);
        }
    }
}