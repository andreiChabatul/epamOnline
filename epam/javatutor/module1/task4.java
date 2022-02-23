package epam.javatutor.module1;

import java.math.BigDecimal;

public class task4 {
    public static void main(String[] args) {
        double r = 125.325;
        double result = (r * 1000) % 1000 + (int) r / 1000.0;
        System.out.println(result);
    }
}