package epam.javatutor.decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task16 {

  /*  Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/

    public static void main(String[] args) {

        int n;
        int number;
        int summa = 0;

        System.out.print("Enter number N: ");
        n = enter();
        if (n < 1){
            System.out.println("Error Enter");
        }
        else {
            number = shapingNumber(n);
            while (calculationQuantity(number) < (n + 1)) {
                if (definitionNegative(creationList(number, n))) {
                    summa = summa + number;
                }
                number++;
            }
            System.out.println("The sum of numbers containing only odd digits: "+summa);
            System.out.println("The number of even digits in the found sum: " +
                    definitionPositiv(creationList(summa,calculationQuantity(summa))));
        }
    }

    public static int calculationQuantity(int a) {
        int result;
        int number = a;

        List<Integer> list = new ArrayList<>(List.of());
        while (number > 0) {
            list.add(number % 10);
            number = number / 10;
        }
        result = list.size();

        return result;
    }

    public static int shapingNumber (int a){
        int result = 1;

        while (a > 1){
            result = result*10;
            a --;
        }

        return result;
    }

    public static int [] creationList (int a, int b){
        int [] mas = new int[b];

        while (a>0){
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (a % 10);
                a = a / 10;
            }
        }

        return mas;
    }

    public static boolean definitionNegative (int [] mas){
        boolean result = true;
        for (int elem : mas) {
            if (elem % 2 == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int definitionPositiv (int [] mas) {
        int result = 0;
        for (int elem : mas) {
            if (elem % 2 == 0 && elem != 0) {
                result++;
            }
        }

        return result;
    }

    public static int enter (){
        int x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        return x;
    }
}