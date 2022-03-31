package epam.javatutor.module3;

public class task2 {

    /*Замените в строке все вхождения 'word' на 'letter'.*/

    public static void main(String[] args) {
        String str = "word fsdf ewfw fdsf  fsdfs, fsdfs word, fdsf word, erewr fd fd word, word";
        String strResult;

        strResult = str.replace("word","letter");

        System.out.print("Original line: ");
        System.out.println(str);
        System.out.print("Changed line: ");
        System.out.println(strResult);
    }
}