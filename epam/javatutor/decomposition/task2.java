package epam.javatutor.decomposition;

import java.util.Scanner;

public class task2 {

/*    Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел*/

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number one: ");
        a = scan.nextInt();
        System.out.print("Enter number two: ");
        b = scan.nextInt();
        System.out.print("Enter number three: ");
        c = scan.nextInt();
        System.out.print("Enter number four: ");
        d = scan.nextInt();

        if (a == 0 || b == 0 || c == 0 || d == 0){
            System.out.println("Numbers cannot be zero");
        }
        else {
            System.out.println("For numbers " + a + " and " + b + " and "+ c + " and " + d + " NOD is: "
                    + countNod(Math.abs(a), Math.abs(b), Math.abs(c), Math.abs(d)));
        }
    }

    public static int countNod (int a, int b, int c, int d){
        int value = Math.min(a,b);
        while ((a % value != 0) || (b % value != 0) || (c % value != 0) || (d % value != 0)) {
            value--;
        }
        return value;
    }
}