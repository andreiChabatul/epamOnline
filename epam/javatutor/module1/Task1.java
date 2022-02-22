package epam.javatutor.module1;

import java.util.Scanner;

public class Task1 {

    /*Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.*/

    public static void main(String[] args) {
        double z;
        double a;
        double b;
        double c;

        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number a: ");
        a = Scan.nextDouble();
        System.out.print("Enter number b: ");
        b = Scan.nextDouble();
        System.out.print("Enter number c: ");
        c = Scan.nextDouble();


        z = ( (a-3) * b / 2) + c;
        System.out.println("Result = " + z);
    }
}