package epam.javatutor.module4.task6;

public class Main {

    public static void main(String[] args) {

        int value;
        Time times = new Time(12,12,12);


        System.out.println("You can do the following with time: ");
        System.out.println("1. Time view.");
        System.out.println("2. Set time.");
        System.out.println("3. Change time.");
        value = Logics.enter();

        switch (value) {
            case (1) -> Logics.viewTime(times);
            case (2) -> Logics.addTime(times);
            case (3) -> Logics.changeTime(times);
        }
    }
}