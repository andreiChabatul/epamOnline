package epam.javatutor.module3;

public class task5 {
    /*    Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
        Крайние пробелы в строке удалить.*/
    public static void main(String[] args) {

        String str = "         fsdf    fsd  fs                 d  fwe fds wr  r2f  fef gg   wrfw f23  fwf w4 e g4rr 23    rwr     r3r 2r23  23r   ";
        String resultString = str;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                resultString = resultString.replace("  ", " ");
            }
        }
        resultString = resultString.trim();


        System.out.println("Initial line: " + str);
        System.out.println("Changed string: " + resultString);
    }
}