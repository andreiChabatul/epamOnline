package epam.javatutor.module1;

public class task14 {

    /*Найти сумму квадратов первых ста чисел*/

    public static void main(String[] args) {

        int result = 0;
        int res;

        for (int i = 0; i < 101; i++) {
            res = i*i;
            result += res;
        }

        System.out.println("Summa of the squares of the first hundred numbers: " + result);

    }
}