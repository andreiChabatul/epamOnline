package epam.javatutor.module1;

import java.util.Scanner;

public class task19 {

/*    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.*/

    public static void main(String[] args) {

        int m;
        int n;
        int a;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number m: ");
        m = scan.nextInt();
        System.out.print("Enter number n: ");
        n = scan.nextInt();


        if (m>=0 && n>=0) {

            if (n < m) {
                a = m;
                m = n;
                n = a;
            }

            for (int i = m; i < n; i++) {

                for (int j = 2; j < m; j++) {
                    if (m % j == 0) {
                        System.out.println("For number " + m + " divisors are: " + j);
                    }
                }
                System.out.println();
                m++;
            }
        }
        else {
            System.out.println("Numbers should be greater than zero.");
        }

        }

    }