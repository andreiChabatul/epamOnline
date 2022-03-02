package epam.javatutor.decomposition;

public class task7 {

/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/

    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i < 10; i +=2) {
            result += factorial(i);
        }
        System.out.println("Sum of factorials of all odd numbers from 1 to 9.: " + result);

    }

    public static int factorial (int a){
        int result = 1;
        for (int i = 1; i < a+1; i++) {
            result = result*i;
        }
        return result;
    }
}