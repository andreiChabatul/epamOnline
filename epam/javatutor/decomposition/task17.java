package epam.javatutor.decomposition;

import java.util.Scanner;

public class task17 {

     /*     Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
        действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

    public static void main(String[] args) {

        int number;

        System.out.print("Enter number: ");
        number = enter();

        if (number < 1) {
            System.out.println("Error Enter");
        }
        else{
            System.out.println("Need to produce " + result(number,summaNumber(number)) + " action");
        }
    }

    public static int summaNumber (int number){
        int result = 0;

        while (number > 0){
            result += (number % 10);
            number = number / 10;
        }

        return result;
    }

    public static int result (int number, int summa){
        int result = 0;

        while (number > 0){
            number -= summa;
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