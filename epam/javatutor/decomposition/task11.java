package epam.javatutor.decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task11 {

  /*  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/

    public static void main(String[] args) {

        int number1;
        int number2;

        System.out.print("Enter number 1: ");
        number1 = enter();
        System.out.print("Enter number 2: ");
        number2 = enter();

        if (calculationQuantily(number1) == calculationQuantily(number2)){
            System.out.println("Number1 contains the same number of digits as number2");
        }
        else if (calculationQuantily(number1)>calculationQuantily(number2)){
            System.out.println("Number1 contains more digits than number2");
        }
        else if (calculationQuantily(number1)<calculationQuantily(number2)) {
            System.out.println("Number2 contains more digits than number1");
        }

    }

    public static int calculationQuantily (int a){
        int result;
        int number = Math.abs(a);

        List<Integer> list = new ArrayList<>(List.of());
        while (number > 0){
            list.add(number % 10);
            number = number /10;
        }

        result = list.size();

        return result;

    }
    public static int enter (){
        int x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        return x;
    }
}