package epam.javatutor.module3.part2;

public class task10 {

    /*Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным
    или вопросительным знаком. Определить количество предложений в строке X.*/

    public static void main(String[] args) {
        String str = "Fsdfsd fsdf sd! Fsdfs f fsd f. Fsdffwef w. Gfjdkshfkjdsh fsdjhf sd. Werwerwer we? Fdgsfdg? Dssdgsfdgsdf fdsgsdger. Fsfwegwe!";
        String [] stringStr = str.split("[!.,?]");

        System.out.println("The line contains " + stringStr.length + " sentences.");
    }
}