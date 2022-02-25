package epam.javatutor.module2;

import java.math.BigInteger;
import java.util.Arrays;

public class task6 {

/*    Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых являются простыми числами.*/


    public static void main(String[] args) {

        int n = 2 + (int) ( Math.random() * 1000 );
        double[] mas = new double[n];
        double summa = 0;

        for (int i = 0; i < mas.length; i++) {
            mas [i] = -500 + Math.random() * 1000;
        }

        System.out.println(Arrays.toString(mas));

        for (int i = 2; i < mas.length; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            if (bigInteger.isProbablePrime((int) Math.log(i))){
                System.out.println("["+i+"]" + " " + mas[i]);
                summa = summa + mas[i];
            }

        }
        System.out.println("The sum of numbers whose serial numbers are prime numbers: " + summa);
    }
}