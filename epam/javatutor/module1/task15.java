package epam.javatutor.module1;

import java.math.BigInteger;

public class task15 {

/*    Составить программу нахождения произведения квадратов первых двухсот чисел*/

    public static void main(String[] args) {

        BigInteger result = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(result);
    }
}
