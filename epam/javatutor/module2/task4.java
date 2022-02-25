package epam.javatutor.module2;

import java.util.Arrays;

public class task4 {

/*    Даны действительные числа а1 ,а2 ,..., аn .
    Поменять местами наибольший и наименьший элементы.*/


    public static void main(String[] args) {

        int n = 2 + (int) ( Math.random() * 10 );
        double[] mas = new double[n];
        double maxi;
        double mini;
        int max = 0;
        int min = 0;


        for (int i = 0; i < mas.length; i++) {
            mas [i] = -500 + Math.random() * 1000;
        }
        maxi = mas[0];
        mini = mas[0];

        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maxi){
                maxi = mas[i];
                max = i;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < mini){
                mini = mas[i];
                min = i;
            }
        }

        mas[min] = maxi;
        mas [max] = mini;
        System.out.println(Arrays.toString(mas));
    }
}