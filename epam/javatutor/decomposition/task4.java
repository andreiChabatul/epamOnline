package epam.javatutor.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {

/* На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
    из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/

    public static void main(String[] args) {
        int n ;
        int a = 0;
        double maximum;

        System.out.print("Enter quantity point: ");
        n = entercoor();
        int [][] mas = new int [3][n];

        while (a != mas[0].length) {
            mas[0][a] = a + 1;
            System.out.print("Coordinate X point " + (a + 1) + ": ");
            mas[1][a] = entercoor();
            System.out.print("Coordinate Y point " + (a + 1) + ": ");
            mas[2][a] = entercoor();
            a ++;
        }
        a = 0;

        System.out.println(Arrays.deepToString(mas));

        maximum = calculation(mas[1][a], mas[1][a+1], mas[2][a] , mas[2][a+1]);

        while (a< mas[0].length-2) {
            a ++;
            if (maximum < calculation(mas[1][a], mas[1][a+1], mas[2][a] , mas[2][a+1])){
                maximum = calculation(mas[1][a], mas[1][a+1], mas[2][a] , mas[2][a+1]);
            }
        }

        a = 0;
        while (a<mas[0].length-1) {
            if ((calculation(mas[1][a], mas[1][a+1], mas[2][a], mas[2][a+1])) == maximum) {
                System.out.println("The longest distance between the points " +
                        (a+1) + " and " + (a+2) +", is: " + maximum);
            }
            a++;
        }
        }

    public static int entercoor (){
        int x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        return x;
    }

    public static double calculation (int a, int b, int c, int d){
        double distance;
        distance = Math.sqrt(((b-a)*(b-a))+((d-c)*(d-c)));
        return distance;
    }
}