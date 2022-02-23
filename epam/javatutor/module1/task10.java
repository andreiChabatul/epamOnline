package epam.javatutor.module1;

import java.util.Scanner;

public class task10 {

/*    Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
            Определить, пройдет ли кирпич через отверстие.*/

    public static void main(String[] args) {

        int a;
        int b;
        int x;
        int y;
        int z;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rectangular hole sizes.");
        System.out.print("Enter rectangular hole size A: ");
        a = scan.nextInt();
        System.out.print("Enter rectangular hole size B: ");
        b = scan.nextInt();

        System.out.println("Enter brick sizes.");
        System.out.print("Enter brick size X: ");
        x = scan.nextInt();
        System.out.print("Enter brick size Y: ");
        y = scan.nextInt();
        System.out.print("Enter brick size Z: ");
        z = scan.nextInt();

        if (a<=0 || b<=0 || x<=0 || y<=0 || z<= 0){
            System.out.println("Dimensions cannot be negative or zero");
        }

        if (Math.min(a,b)>=Math.min(Math.min(x,y),z)){
            if (Math.max(a,b) >= Math.min(x,y)){
                System.out.println("Brick will pass");
            }
            else System.out.println("Brick do not will pass");
        }
        else System.out.println("Brick do not will pass");

    }
}