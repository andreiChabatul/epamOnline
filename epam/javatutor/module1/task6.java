package epam.javatutor.module1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task6 {

/*    Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае:*/

    public static void main(String[] args) {

        int x;
        int y;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter X: ");
        x = scan.nextInt();
        System.out.print("Enter Y: ");
        y = scan.nextInt();

        if (y>=0 && y<=4){
            if (-2 <= x && x <=2){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else if (y<=0 && y>=-3){
            if (-4 <=x && x <=4){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

    }

}