package epam.javatutor.module3.part2;

public class task6 {
/*    Из заданной строки получить новую, повторив каждый символ дважды.*/

    public static void main(String[] args) {
        String str = "fds gdf fewfwe hdf sdf h sdfwr g sfaf";
        StringBuilder resultStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            temp = temp + str.charAt(i) + str.charAt(i);
            resultStr.append(temp);
        }
        resultStr = new StringBuilder(resultStr.toString().replace("  ", " "));


        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + resultStr);
    }
}