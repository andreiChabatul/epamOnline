package epam.javatutor.module2;

import java.util.Arrays;

public class task3 {

/*    Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/

    public static void main(String[] args) {

        int n = 2 + (int) ( Math.random() * 100 );
        double[] mas = new double[n];
        int quantlyzero = 0;
        int quantlynegative = 0;
        int quantlypositive = 0;


        for (int i = 0; i < mas.length; i++) {
            mas [i] = -500 + Math.random() * 1000;
        }

        System.out.println(Arrays.toString(mas));


        for (double elem : mas) {
            if (elem == 0) {
                quantlyzero++;
            } else if (elem > 0)
                quantlypositive++;
            else if (elem < 0)
                quantlynegative++;
        }

        System.out.println("Quaintly zero: " + quantlyzero);
        System.out.println("Quaintly positive: " + quantlypositive);
        System.out.println("Quaintly negative: " + quantlynegative);
        }
    }