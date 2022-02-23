package epam.javatutor.module1;

public class task4 {

/*    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

    public static void main(String[] args) {
        double r = 125.325;
        double result = (r * 1000) % 1000 + (int) r / 1000.0;
        System.out.println(result);
    }
}