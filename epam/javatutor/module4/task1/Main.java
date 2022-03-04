package epam.javatutor.module4.task1;

public class Main {

    public static void main(String[] args) {

        Test1 test = new Test1(15,25);

        System.out.println("Summa " + Logics.summa(test));
        System.out.println("Maximum number " + Logics.comparison(test));
        Logics.view(test);

    }
}