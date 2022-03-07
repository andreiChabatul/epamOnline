package epam.javatutor.module4.task6;

public class Time {
/*
    Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
    изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
    недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
    заданное количество часов, минут и секунд.*/

    public int hour;
    public int minute;
    public int seconds;

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour > 24 || hour < 0){
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;

    }

    public void setMinute(int minute) {
        this.minute = minute;
        if (minute > 60 || minute < 0){
            this.minute = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        if (seconds > 60 || seconds < 0){
            this.seconds = 0;
        }
    }
}
