package epam.javatutor.module1;

public class task19 {

/*    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.*/

    public static void main(String[] args) {

        int m = 11;
        int n = 30;
        int a = m;

        if (n < m){
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

    }
