package epam.javatutor.module3;

import java.util.Arrays;

public class task1 {
    /*Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/

    public static void main(String[] args) {

        String[] str = {"infixCaps", "capWords", "camelCase", "wordCase", "nerdСaps", "polyCaps", "bumpyCaps", "humpBack", "camelCaps"};
        String[] resultStr = new String [str.length];

        for (int j = 0; j < str.length; j++) {
            for (int i = 0; i < str[j].length() - 1; i++) {
                if (Character.isLowerCase(str[j].charAt(i)) && Character.isUpperCase(str[j].charAt(i + 1))) {
                    String oneWord = str[j].substring(0, i + 1);
                    String secondWord = str[j].substring(i + 1);
                    secondWord = secondWord.replace(secondWord.charAt(0), Character.toLowerCase(secondWord.charAt(0)));
                    resultStr[j] = oneWord + "_" + secondWord;
                }
            }
        }
        System.out.println("Starting array: " + Arrays.toString(str) );
        System.out.print("Modified array: "+ Arrays.toString(resultStr));
    }
}