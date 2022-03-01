package epam.javatutor.decomposition;

import java.util.Scanner;

public class task1 {

/*    Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
    натуральных чисел:*/

    public static void main(String[] args) {
        int a;
        int b;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number one: ");
        a = scan.nextInt();
        System.out.print("Enter number two: ");
        b = scan.nextInt();

        if (a == 0 || b == 0){
            System.out.println("Numbers cannot be zero");
        }
        else {
            System.out.println("For numbers " + a + " and " + b + " NOD is: " + countNod(Math.abs(a), Math.abs(b)));
            System.out.println("For numbers " + a + " and " + b + " NOK is: " + countNok(Math.abs(a), Math.abs(b)));
        }
    }

    public static int countNok (int a, int b){
        int value = Math.min(a,b);
        while ((value % a != 0) || (value % b != 0)) {
            value++;
        }
        return value;
    }

    public static int countNod (int a, int b){
        int value = Math.min(a,b);
        while ((a % value != 0) || (b % value != 0)) {
            value--;
        }
        return value;
    }
}