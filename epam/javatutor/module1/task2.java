package epam.javatutor.module1;

import java.util.Scanner;

public class task2 {

/*    Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/

    public static void main(String[] args) {

        double result;
        double a;
        double b;
        double c;

        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number a: ");
        a = Scan.nextDouble();
        if (a != 0) {
            System.out.print("Enter number b: ");
            b = Scan.nextDouble();
            System.out.print("Enter number c: ");
            c = Scan.nextDouble();
            result = ((b+Math.sqrt(b*b+(4*a*c)))/(2*a))-(Math.pow(a,3)*c)+(Math.pow(b,-2));
            System.out.println("Result = " + result);
        }
        else {
            System.out.println("Divide by zero is not possible");
        }
    }
}
