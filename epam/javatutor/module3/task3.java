package epam.javatutor.module3;

public class task3 {
    /* В строке найти количество цифр.*/
    public static void main(String[] args) {
        String str = "2 fds 5 fd 6 gf 57 423 5 rfs 23 54 rwer 543 fds dh asd 423 634 sad 8 23 8677 32 sfsdg 5435 ";
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                result ++;
            }
        }
        System.out.println("Number of numbers per line: " + result);
    }
}