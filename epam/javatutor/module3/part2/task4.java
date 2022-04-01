package epam.javatutor.module3.part2;

public class task4 {

/*    С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.*/

    public static void main(String[] args) {

        String str = "информатика";
        String [] strings = new String[4];
        int j = 1;
        StringBuilder resultStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'т' || str.charAt(i) == 'о' || str.charAt(i) == 'р'){
                strings [j] = String.valueOf(str.charAt(i));
                j ++;
            }
        }
        strings[0]=strings[3];

        for (String string : strings) {
            resultStr.append(string);
        }


        System.out.println(resultStr);
    }
}