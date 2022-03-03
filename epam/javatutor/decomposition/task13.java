package epam.javatutor.decomposition;

import java.math.BigInteger;
import java.util.Scanner;

public class task13 {

/*    Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
    решения задачи использовать декомпозицию.*/

    public static void main(String[] args) {
        int n;
        int n2;

        System.out.print("Enter number N: ");
        n = enter();
        n2 = 2*n;

        if (n < 2){
            System.out.println("Number N cannot be less than 2.");
        }
        else {
            while (n < (n2)) {
                if (primeNumber(n) && primeNumber(n + 2)) {
                    System.out.println("Pairs of twins are: " + n + " " + (n + 2));
                }
                n += 1;
            }
        }
    }

    public static boolean primeNumber (int a){
        boolean result = false;
        BigInteger bigInteger = BigInteger.valueOf(a);
        if (bigInteger.isProbablePrime(a)){
            result = true;
        }
        return result;
    }

    public static int enter (){
        int x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        return x;
    }
}