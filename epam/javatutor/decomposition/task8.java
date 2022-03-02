package epam.javatutor.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class task8 {

/*    Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    массива с номерами от k до m.*/

    public static void main(String[] args) {

        int n;
        int k;
        int[] mas;


        System.out.print("Enter lenght array: ");
        n = enter();
        if (n < 3) {
            System.out.println("The length of the array cannot be less than 3");
        } else {
            mas = createMas(n);
            System.out.println(Arrays.toString(mas));
            System.out.print("Enter number k: ");
            k = enter();
            if (k > mas.length-2){
                System.out.println("The number k cannot be more " + (mas.length-2));
            }
            else {
                System.out.println("The sums of three consecutive array elements with numbers from " + "k: " + summa(mas, k));
            }
        }
    }

    public static int enter (){
        int x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        return x;
    }

    public static int summa(int [] mas, int a) {
        int summa = 0;
        for (int i = a - 1; i < a + 2; i++) {
            summa = summa + mas[i];
        }
        return summa;
    }

    public static int [] createMas (int a){
        int [] mas = new int[a];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 2 + (int) (Math.random() * 50);
        }
        return mas;
    }
}