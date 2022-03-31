package epam.javatutor.module3.part2;

public class task1 {
    /*Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.*/

    public static void main(String[] args) {

        int result = 1;
        int finishResult = 0;
        String str = "                         fs 32df    fs 324d  fs               d  fw rwe234 23e rwer, dsf . fe ! ! fsd  twt // fds wr  r2f  fef gg   wrfw f23  fwf w4 e g4rr 23    rwr     r3r 2r23  23r   ";


        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i+1) == ' '){
                result ++;
            }
            else {
                finishResult = Math.max(finishResult,result);
                result = 1;
            }
        }

        System.out.println("The largest number of consecutive spaces: " + finishResult);
    }
}