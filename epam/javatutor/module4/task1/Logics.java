package epam.javatutor.module4.task1;

public class Logics {

    public static int summa (Test1 test1){
        return test1.number1+test1.number2;
    }

    public static int comparison (Test1 test1){
        return (Math.max(test1.number1,test1.number2));
    }

    public static void view (Test1 test1){
        System.out.println(test1.number1 + " " + test1.number2);
    }
}
