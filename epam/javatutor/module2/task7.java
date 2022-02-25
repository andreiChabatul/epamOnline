package epam.javatutor.module2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task7 {

/*    Дана последовательность целых чисел a a an  , , 1 2 . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( , , , ) a1 a2  an.*/

    public static void main(String[] args) {

        int n = 2 + (int) ( Math.random() * 50 );
        Integer [] mas = new Integer[n];
        int min;


        for (int i = 0; i < mas.length; i++) {
            mas [i] =  (int) ( Math.random() * 20 );
        }

        min = mas [0];
        System.out.println(Arrays.toString(mas));
        List<Integer> mas1 = new ArrayList<>(Arrays.asList(mas));

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min){
                min = mas[i];
            }
        }

        System.out.println("Minimal value: "+min);

        for (int i = 0; i < mas1.size(); i++) {
            if (mas[i] == min){
                mas1.remove(i);
            }
        }
        System.out.println(mas1);

    }
}
