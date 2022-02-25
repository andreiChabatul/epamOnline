package epam.javatutor.module2;

import java.util.Arrays;

public class task5 {

 /*   Даны целые числа а1 ,а2 ,..., аn .
    Вывести на печать только те числа, для которых аi > i*/

    public static void main(String[] args) {

        int n = 2 + (int) ( Math.random() * 20 );
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas [i] = (int) ( Math.random() * 15 );
        }

        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            if (mas[i]>i)
                System.out.println(mas[i]+" > "+"["+i+"]");
        }

    }
}