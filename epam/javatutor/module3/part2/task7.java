package epam.javatutor.module3.part2;

public class task7 {

    /*        Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
          Например, если было введено "abc cde def", то должно быть выведено "abcdef".*/

    public static void main(String[] args) {

        String str = "dsf gfd fdsdwe fsdg sdas fsd sd gs ddsfafsf";
        StringBuilder resultStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && str.charAt(i)!= ' '){
                    resultStr.append(str.charAt(i));
                    str = str.replace(str.charAt(j),' ');
                }
            }
        }

        System.out.println("Finished string: " + resultStr);
    }
}