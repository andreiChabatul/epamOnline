package epam.javatutor.decomposition;

import java.util.Scanner;

public class task3 {

/*    Вычислить площадь правильного шестиугольника со стороной а,
    используя метод вычисления площади треугольника.*/

    public static void main(String[] args) {
        int a;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter side size: ");
        a = scan.nextInt();

        if (a == 0 || a < 0){
            System.out.println("Side size cannot be negative or less than zero");
        }
        else {
            System.out.println("Area of a regular hexagon with a side "+ a + " is " + (6 * area(a)));
        }
    }

    public static double area (int a){
        double area;
        area = (Math.sqrt(3)/4)*a*a;
        return area;
    }
}