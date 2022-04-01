package epam.javatutor.module3.part2;

public class task5 {
/*    Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.*/

    public static void main(String[] args) {

        String str = "fsd fsdf fwef grdfss fregsdf wesadfafweg pdfsdager fwqfa gerfas qwsa gasd gwesaa";

        calculationRepetition(str,'p');
        calculationRepetition(str,'a');
        calculationRepetition(str,'f');

    }

    public static void calculationRepetition (String str, char symbol){
        int repetition = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol){
                repetition ++;
            }
        }
        System.out.println("The character " + "'"+ symbol + "'"+ " occurs in the given string " + repetition + " times.");
    }
}