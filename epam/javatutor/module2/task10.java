package epam.javatutor.module2;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
        элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/


import java.util.Arrays;

public class task10 {

    public static void main(String[] args) {

        int n = 2 + (int) ( Math.random() * 10 );
        int[] mas = new  int[n];

        for (int i = 0; i < mas.length; i++) {
            mas [i] = -100 + (int) ( Math.random() * 1000 );
        }

        System.out.println(Arrays.toString(mas));

        for (int i = 1; i < mas.length; i = i +2) {
            mas[i] = 0;
        }
        System.out.println(Arrays.toString(mas));

    }
}