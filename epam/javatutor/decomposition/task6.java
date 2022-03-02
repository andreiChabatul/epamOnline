package epam.javatutor.decomposition;

import java.util.Scanner;

public class task6 {

/*    Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/

    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        System.out.print("Enter number 1: ");
        number1 = enternumber();
        System.out.print("Enter number 2: ");
        number2 = enternumber();
        System.out.print("Enter number 3: ");
        number3 = enternumber();

        if ((countNod(countNod(number1,number2), number3)) == 1){
            System.out.println("The numbers are coprime");
        }
        else{
            System.out.println("The numbers are not coprime");}
    }

    public static int enternumber (){
        int number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        return number;
    }

    public static int countNod (int a, int b){
        int value = Math.min(a,b);
        while ((a % value != 0) || (b % value != 0)) {
            value--;
        }
        return value;
    }

}