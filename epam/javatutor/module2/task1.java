package epam.javatutor.module2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class task1 {

    /*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 2 + (int) ( Math.random() * 500 );
        int mas [] = new int [n];
        int k;

        for (int i = 0; i < mas.length; i++) {
            mas [i] = (int) ( Math.random() * 50000 );
        }

        System.out.print("Enter number K: ");
        k = in.nextInt();

        if (k == 0){
            System.out.println("Number cannot be zero.");
        }
        else{
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] % k == 0){
                    System.out.println(mas[i] + " multiple " + k);
                }
            }
        }

        System.out.println(Arrays.toString(mas));




    }
}
