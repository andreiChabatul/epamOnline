package epam.javatutor.module3.part2;

public class task9 {

/*    Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
      Учитывать только английские буквы.*/

    public static void main(String[] args) {

        String str = "F f D DD d fds fds ewJH HG Fjhhgf guyV Kg UY KuHYUf FuJK Lkjg GFgiO kjhk";
        int upperSymbol = 0;
        int lowerSymbol = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                upperSymbol ++;
            }
            else {
                if (Character.isLowerCase(str.charAt(i))){
                    lowerSymbol ++;
                }
            }

        }
        System.out.println("The line contains " + upperSymbol + " capital letters, and " + lowerSymbol + " small letter.");
    }
}