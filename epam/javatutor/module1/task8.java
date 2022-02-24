package epam.javatutor.module1;

import java.util.Scanner;

public class task8 {

    /*  Найти max{min(a, b), min(c, d)}.*/

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number a: ");
        a = scan.nextInt();
        System.out.print("Enter number b: ");
        b = scan.nextInt();
        System.out.print("Enter number c: ");
        c = scan.nextInt();
        System.out.print("Enter number d: ");
        d = scan.nextInt();

        System.out.println("max{min(a, b), min(c, d)} = " + Math.max(Math.min(a, b), Math.min(c, d)));

    }
}