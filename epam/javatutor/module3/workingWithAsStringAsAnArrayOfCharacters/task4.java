package epam.javatutor.module3.workingWithAsStringAsAnArrayOfCharacters;

public class task4 {
/*    В строке найти количество чисел.*/

    public static void main(String[] args) {
        String str = "2 fds 5 fd 6 gf 57, 234,dsf asfw 423 423 rfs 23 54 rwer 543 fds dh asd 423 634 sad 8 23 8677 32 sfsdg 5435 ";
        int result = 0;

        String [] strNumber = str.split("\\D");

        for (int i = 0; i < strNumber.length; i++) {
            if (strNumber[i].isEmpty()){
                strNumber[i] = ".";
            }
        }

        for (String string : strNumber) {
            if (Character.isDigit(string.charAt(0))) {
                result++;
            }
        }

        System.out.println("The number of numbers in a line: " + result);
    }
}