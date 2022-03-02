package epam.javatutor.decomposition;

import java.util.Scanner;

public class task9 {

/*    Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
    если угол между сторонами длиной X и Y— прямой.*/


    public static void main(String[] args) {

        int x;
        int y;
        int z;
        int t;

        System.out.print("Enter lenght X: ");
        x = enter();
        System.out.print("Enter lenght Y: ");
        y = enter();
        System.out.print("Enter lenght Z: ");
        z = enter();
        System.out.print("Enter lenght T: ");
        t = enter();

        if (x < 0 || x ==0 ||y < 0 || y ==0 || z < 0 || z ==0 || t < 0 || t ==0
                || calculationAngle(x, y, z, t) < 0 || calculationAngle(x, y, z, t) == 0){
            System.out.println("eq");
        } else {
            System.out.println(calculationAngle(x, y, z, t));
            System.out.println(calculationarea(calculationAngle(x, y, z, t), x, y, z, t));
        }
    }

    public static double calculationAngle (int a, int b, int c, int d){
        double hypotenuse;
        double result;
        hypotenuse = Math.sqrt((a*a)+(b*b));

        result = Math.acos(((c*c)+(d*d)-(hypotenuse*hypotenuse))/(2*c*d));
        result = Math.toDegrees(result);
        return result;
    }

    public static double calculationarea (double e, int a, int b, int c, int d){
        double result;
        int perimeter;

        perimeter = (a+b+c+d)/2;
        result = Math.sqrt(((perimeter-a)*(perimeter-b)*(perimeter-c)*(perimeter-d))
                -(a*b*c*d*(Math.cos((e+90)/2))*Math.cos((e+90)/2)));
        return result;
    }

    public static int enter (){
        int x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        return x;
    }
}