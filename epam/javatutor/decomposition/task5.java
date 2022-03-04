package epam.javatutor.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {

/*    Составить программу, которая в массиве A[N] находит второе по величине число
            (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).*/

    public static void main(String[] args) {

        int n;
        int [] mas;

        System.out.print("Enter number N: ");
        n = enter();

        if (n<2){
            System.out.println("Array length cannot be less than 2.");
        }
        else {
            mas = createArray(n);
            System.out.println(Arrays.toString(mas));
            deleteMax(mas, searchMax(mas));
            System.out.println("The second largest number in the given array " + mas[searchMax(mas)]);
        }
    }

    public static int [] createArray (int length){
        int[] mas = new int [length];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = 2 + (int) (Math.random() * 1500);
        }

        return mas;
    }

    public static int searchMax (int [] mas){
        int max = mas[0];
        int id = 0;
        for (int i = 1; i < mas.length; i++) {
            if (max<mas[i]){
                max = mas[i];
                id = i;
            }
        }
        return id;
    }

    public static void deleteMax (int [] mas , int id){
        mas [id] = -2147483648;
    }

    public static int enter (){
        int x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        return x;
    }
}