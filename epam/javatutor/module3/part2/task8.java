package epam.javatutor.module3.part2;

public class task8 {

/*    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
    длинных слов может быть несколько, не обрабатывать.*/

    public static void main(String[] args) {

        String str = "fsdf fsdf fwef wefwefwef fwefwef dshgfjsdgfhsdgfhsdgfsgdf wfefwefwef wfefewfwefewf fwefwefwefwefewfwefw fewfwef";
        String [] stringStr  = str.split(" ");
        String resultStr  = "";

        for (String string : stringStr) {
            if (resultStr.length() < string.length()) {
                resultStr = string;
            }
        }
        System.out.println("Longest word in a string: " + resultStr);
    }
}