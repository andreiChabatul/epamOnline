package epam.javatutor.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class task12 {

/*    Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
    являются числа, сумма цифр которых равна К и которые не большее N.*/


    public static void main(String[] args) {

        int [] mas;
        int numbermax;
        int lenghtarray;
        int numbersumma;

        System.out.print("Enter lenght array: ");
        lenghtarray = enter();
        System.out.print("Enter number K: ");
        numbersumma = enter();
        System.out.print("Enter number N: ");
        numbermax = enter();

        if (lenghtarray < 1 || numbersumma < 1 || numbermax < 1){
            System.out.println("Error enter");
        }
        else{
            mas = new int[lenghtarray];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = calculationRandom(numbersumma,numbermax);
            }

            System.out.println(Arrays.toString(mas));
        }


        }

    public static int calculationRandom (int a, int b){
        int result = 0;

        int number = 1 + (int) ( Math.random() * b);
        int value = number;

        while (true) {
            while (value > 0) {
                result = result + (value % 10);
                value = value / 10;
            }
            if (result == a){
                break;
            }
            else{
                number = 1 + (int) ( Math.random() * b);
                value = number;
                result = 0;
            }
        }
        return number;
    }

    public static int enter (){
        int x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        return x;
    }
}