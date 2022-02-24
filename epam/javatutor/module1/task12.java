package epam.javatutor.module1;

import java.util.Scanner;

public class task12 {

/*    Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.*/

    public static void main(String[] args) {

        int number;
        int result = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = scan.nextInt();

        if (number < 0){
            System.out.println("Number must be positive");
        }

        for (int i = 0; i < number+1; i++) {
            result += i;
        }

        System.out.println("Result: " + result);

    }
}
