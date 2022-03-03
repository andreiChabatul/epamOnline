package epam.javatutor.decomposition;

import java.util.Scanner;

public class task14 {

/*    Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
    возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
    использовать декомпозицию.*/

    public static void main(String[] args) {
        int number;

        System.out.print("Enter number k: ");
        number = enter();

        if (number < 1){
            System.out.println("Error enter");
        }
        else {
            while (number > 1) {
                if (number == summaNumber(number)) {
                    System.out.println(number + " is the Armstrong number.");
                }
                number --;
            }
        }
    }

    public static double summaNumber (int a){
        int value = a;
        double result;
        double summa = 0;

        while (a>0){
            result = a % 10;
            a = a / 10;
            summa = summa + Math.pow(result,numberOfDigits(value));
        }

        return summa;
    }

    public static double numberOfDigits (int a){
        int result = 0;
        int value = 0;
        while (a>0){
            value = value + (a % 10);
            a = a / 10;
            result ++;
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