package epam.javatutor.decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task15 {

/*    Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
    последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

    public static void main(String[] args) {

        int n;
        int number;


        System.out.print("Enter number N: ");
        n = enter();
        if (n<2){
            System.out.println("Error enter.");
        }
        else {
            number = shapingNumber(n);
            while (calculationQuantity(number) < n + 1) {
                if (comparison(creationList(number, n))) {
                    System.out.println("Numbers whose digits form a strictly increasing sequence: " + number);
                }
                number++;
            }
        }
    }

    public static int calculationQuantity(int a) {
        int result;
        int number = a;

        List<Integer> list = new ArrayList<>(List.of());
        while (number > 0) {
            list.add(number % 10);
            number = number / 10;
        }
        result = list.size();

        return result;
    }

    public static int shapingNumber (int a){
        int result = 1;

        while (a > 1){
            result = result*10;
            a --;
        }

        return result;
    }

    public static int [] creationList (int a, int b){
       int [] mas = new int[b];

        while (a>0){
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (a % 10);
                a = a / 10;
            }
        }

        return mas;
    }

    public static boolean comparison (int [] mas){
        boolean result = true;

        for (int i = 0; i < mas.length-1; i++) {
            if (mas[i] < mas[i + 1] || mas[i] == mas[i + 1]) {
                result = false;
                break;
            }
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