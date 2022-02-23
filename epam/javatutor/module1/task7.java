package epam.javatutor.module1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task7 {

 /*   Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 и если да, то будет ли он прямоугольным.*/

    public static void main(String[] args) {
        int angle1;
        int angle2;
        int angle3;

        Scanner angle = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        angle1 = angle.nextInt();
        System.out.print("Enter second angle: ");
        angle2 = angle.nextInt();


        if (angle1 <=0 || angle2 <=0){
            System.out.println("Angle value cannot be negative or zero.");
        }
        else{
            angle3 = 180 - angle1 - angle2;
            if (angle3 > 0){
                if (angle1 == 90 || angle2 == 90 || angle3 == 90){
                    System.out.println("The triangle exists and is a right triangle.");
                }
                else {
                    System.out.println("The triangle exists.");
                }
            }
            else {
                System.out.println("The triangle doesn't exist.");
            }
        }

    }
}