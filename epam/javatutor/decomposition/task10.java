package epam.javatutor.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task10 {

/*    Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
    являются цифры числа N.*/

    public static void main(String[] args) {

        int n;
        int number;
        int [] mas;

        System.out.print("Enter the length of the array: ");
        n = enter();
        if (n < 1){
            System.out.println("The length of an array can not be less than one");
        }
        else {
            System.out.print("Enter number: ");
            number = enter();
            if (number < 0) {
                System.out.println("The number must be natural");
            } else {
                mas = new int[n];

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = random(number);
                }
                System.out.println(Arrays.toString(mas));
            }
        }
    }

        public static int enter (){
            int x;

            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();

            return x;
        }

        public static int random (int a){
        int result;

        List<Integer>list = new ArrayList<>(List.of());
            while (a > 0){
        list.add(a % 10);
        a = a /10;
        }

        result = list.get((int) (Math.random() * ((list.size()-1) + 1)));

        return result;
        }
}