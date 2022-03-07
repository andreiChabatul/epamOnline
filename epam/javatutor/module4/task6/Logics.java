package epam.javatutor.module4.task6;

import java.util.Scanner;

public class Logics {
    public static void viewTime  (Time times){
        System.out.println(times.hour + "H:" + times.minute + "Min:" + times.seconds+"Sec");
    }
    public static int enter (){
        int x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        return x;
    }
    public static void addTime (Time times){
        int change;
        System.out.println("Enter desired time change:");
        System.out.print("Clock change: ");
        change = enter();
        times.setHour(times.getHour()+change);
        System.out.print("Minute change: ");
        change = enter();
        times.setMinute(times.getMinute()+change);
        System.out.print("Seconds change: ");
        change = enter();
        times.setSeconds(times.getSeconds()+change);
        viewTime(times);
    }
    public static void changeTime (Time times){
        System.out.println("Enter time change:");
        System.out.print("Clock change: ");
        times.setHour(enter());
        System.out.print("Minute change: ");
        times.setMinute(enter());
        System.out.print("Seconds change: ");
        times.setSeconds(enter());
        viewTime(times);
    }
}
