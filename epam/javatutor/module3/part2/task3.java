package epam.javatutor.module3.part2;

public class task3 {

/*    Проверить, является ли заданное слово палиндромом.*/

    public static void main(String[] args) {
        String number = "30203";
        String numberOne = "423423";
        String numberSecond = "1713302033171";

        numberPalindrome(number);
        numberPalindrome(numberOne);
        numberPalindrome(numberSecond);

    }
    public static void numberPalindrome (String number){
        boolean check = true;
        StringBuilder reverse = new StringBuilder(number);

        String reverseNumber = reverse.reverse().toString();

        for (int i = 0; i < reverseNumber.length(); i++) {
            if (!(number.charAt(i) == reverseNumber.charAt(i))) {
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("Number is not a palindrome.");
        }
    }
}