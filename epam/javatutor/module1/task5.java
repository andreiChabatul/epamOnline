package epam.javatutor.module1;

import java.util.Scanner;

public class task5 {

/*    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc.*/

    public static void main(String[] args) {
        int hour;
        int minute;
        int second;
        String minute1;
        String second1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number => ");
        int seconds = scanner.nextInt();

        if (seconds == 0 || seconds < 0) {
            System.out.println("The number cannot be negative or zero");
        } else {
            hour = (24 * seconds) / 86400;
            minute = (seconds - (hour * 3600)) / 60;
            second = ((seconds - (hour * 3600))) - (minute * 60);
            if (hour == 24) {
                hour = 0;
            }
            if (minute < 10) {
                minute1 = ("H 0" + minute);
            } else
                minute1 = ("H " + minute);

            if (second < 10) {
                second1 = ("min " + second+ "s ");
            } else
                second1 = ("min " + second + "s ");

            System.out.println(hour + minute1 + second1);
        }
    }
}