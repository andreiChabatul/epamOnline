package epam.javatutor.module1;

import java.util.Scanner;

public class task9 {

    /*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
    Определить, будут ли они расположены на одной прямой.*/

    public static void main(String[] args) {

        int x1;
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first point A.");
        System.out.print("Enter x: ");
        x1 = scan.nextInt();
        System.out.print("Enter y: ");
        y1 = scan.nextInt();

        System.out.println("Enter second point B.");
        System.out.print("Enter x: ");
        x2 = scan.nextInt();
        System.out.print("Enter y: ");
        y2 = scan.nextInt();

        System.out.println("Enter third point C.");
        System.out.print("Enter x: ");
        x3 = scan.nextInt();
        System.out.print("Enter y: ");
        y3 = scan.nextInt();


        if ((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3) == 0){
            System.out.println("The points are on the same line");
        }
        else {
            System.out.println("The points do not lie on the same line");
        }

    }
}